package extractror;
/* Dev Kelyn created the file on 2021-02-22 inside the package - extractror */

import models.Company;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.util.List;

/**
 *
 */
public class CompanyExtractor implements Extractor {
    private Extractor extractor;

    @Override
    public void setNext(Extractor extractor) {
        this.extractor = extractor;
    }

    @Override
    public Company extract(Company company, List<XWPFTable> tables, int tableNumber) {

        XWPFTable table = tables.get(tableNumber);

        for(int i = 0; i< table.getNumberOfRows(); i++){
                    XWPFTableRow row = table.getRow(i);
                    List<XWPFTableCell> cells = row.getTableCells();
                    switch (cells.get(0).getText().replace(" ","")){
                        case "COMPANYREPORTED:":
                            company.setName(cells.get(1).getText().toUpperCase());
                            break;
                        case  "TradeNames:":
                            company.setTradeName(cells.get(1).getText());
                            break;
                        case  "PrincipalAddress:":
                            company.setPrincipalAddress(cells.get(1).getText());
                            break;
                        case  "Telephone:":
                            company.setTelephone(cells.get(1).getText());
                            break;
                        case  "Fax:":
                            company.setFax(cells.get(1).getText());
                            break;
                        case  "Email:":
                            company.setEmail(cells.get(1).getText());
                            break;
                        case  "Internet:":
                            company.setWebsite(cells.get(1).getText());
                            break;
                        case  "Established:":
                            company.setEstablished(cells.get(1).getText());
                            break;
                        case  "Registration:":
                            company.setRegistration(cells.get(1).getText());
                            break;
                        case  "LegalForm:":
                            company.setLegalForm(cells.get(1).getText());
                            break;
                        case  "StockListing:":
                            company.setStockListing(cells.get(1).getText());
                            break;
                        case  "Workforce:":
                            company.setWorkForceYear(cells.get(1).getText());
                            break;
                        case  "Headoffices":
                            company.setHeadOffices(cells.get(1).getText());
                            break;
                        case  "Branches":
                            company.setBranches(cells.get(1).getText());
                            break;
                        case "VATnumber:":
                            company.setVatNumber(cells.get(1).getText());
                        default:
                            continue;
                    }

        }

        return new ShareholderExtractor()
                .extract(company, tables,tableNumber);

    }
}
