package extractror;
/* Dev Kelyn created the file on 2021-02-22 inside the package - extractror */

import models.BusinessDetails;
import models.Company;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.util.List;

/**
 *
 */
public class businessDetailsExtractor implements Extractor {
    private Extractor extractor;

    @Override
    public void setNext(Extractor extractor) {
        this.extractor = extractor;
    }

    @Override
    public Company extract(Company company, List<XWPFTable> tables, int tableNumber) {
        BusinessDetails businessDetails = new BusinessDetails();
        for (int j = 1; j < 16; j++) {
            XWPFTable table = tables.get(j);
            for (int i = 0; i < table.getNumberOfRows(); i++) {
                XWPFTableRow row = table.getRow(i);
                List<XWPFTableCell> cells = row.getTableCells();
                switch (cells.get(0).getText().replace(" ", "")) {
                    case "COMPANYREPORTED:":
                        businessDetails.setCompanyName(cells.get(1).getText().toUpperCase());
                        break;
                    case "NominalCapital":
                        businessDetails.setNominalCapital(cells.get(1).getText());
                        break;
                    case "SubscribedCapital":
                        businessDetails.setSubscribedCapital(cells.get(1).getText());
                        break;
                    case "CreditOpinion:":
                        businessDetails.setCreditOpinion(cells.get(1).getText());
                        break;
                    case "CorporateCreditRating":
                        businessDetails.setCooperateCreditRating(cells.get(1).getText());
                        break;
                    case "CompanyHistory"://get next row, first column
                        businessDetails.setCompanyHistory(table.getRow(i + 1).getTableCells().get(0).getText());
                        break;
                    case "BusinessActivities":
                        businessDetails.setBusinessActivities(cells.get(1).getText());
                        if(businessDetails.getBusinessActivities().isEmpty()){//if empty, then get activities from next line
                            businessDetails.setBusinessActivities(table.getRow(i + 1).getTableCells().get(0).getText());
                        }
                        break;
                    case "Buyingterms":
                        businessDetails.setBuyingTerms(cells.get(1).getText());
                        break;
                    case "Sellingterms":
                        businessDetails.setSellingTerms(cells.get(1).getText());
                        break;
                    case "Suppliers":
                        businessDetails.setSuppliers(cells.get(1).getText());
                        break;
                    case "Customers":
                        businessDetails.setCustomers(cells.get(1).getText());
                        break;
                    case "RecentSales":
                        businessDetails.setRecentSales(cells.get(1).getText());
                        break;
                    case "Exports":
                        businessDetails.setExports(cells.get(1).getText());
                        break;
                    case "ExportRatio":
                        businessDetails.setExportRatio(cells.get(1).getText());
                        break;
                    case "ImportRatio":
                        businessDetails.setImportRatio(cells.get(1).getText());
                        break;
                    case "Imports":
                        businessDetails.setImports(cells.get(1).getText());
                        break;
                    case "DomesticMarketShare":
                        businessDetails.setDomesticMarketShare(cells.get(1).getText());
                    case "BusinessPremises":
                        businessDetails.setBusinessPremises(cells.get(1).getText());
                        break;
                    case "Typeofoccupation":
                        businessDetails.setTypeOfOccupation(cells.get(1).getText());
                        break;
                    case "Location":
                        businessDetails.setLocation(cells.get(1).getText());
                        break;
                    case "MainBanks":
                        businessDetails.setMainBanks(cells.get(1).getText());
                        break;
                    case "PaymentMorale:":
                        businessDetails.setPaymentMorale(cells.get(1).getText());
                        break;
                    case "CREDITRATING:":
                        businessDetails.setCreditRating(cells.get(1).getText());
                        break;
                    default:
                        continue;
                }
            }

        }
        company.setBusinessDetails(businessDetails);

        return new DirectorExtractor()
                .extract(company, tables, tableNumber);
    }
}
