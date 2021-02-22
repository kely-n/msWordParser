package extractror;
/* Dev Kelyn created the file on 2021-02-22 inside the package - extractror */

import models.BusinessDetails;
import models.Company;
import models.Shareholder;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ShareholderExtractor implements Extractor {
    private Extractor extractor;

    @Override
    public void setNext(Extractor extractor) {
        this.extractor = extractor;
    }

    @Override
    public Company extract(Company company, List<XWPFTable> tables, int tableNumber) {

        XWPFTable table = tables.get(tableNumber);
        List<Shareholder> shareholders = new ArrayList<>();
        for (int i = 0; i < table.getNumberOfRows(); i++) {
            XWPFTableRow row = table.getRow(i);
            List<XWPFTableCell> cells = row.getTableCells();
            if(cells.size()==4){
                if(!cells.get(0).getText().replace(" ","").equalsIgnoreCase("Total")){
                    if(!cells.get(0).getText().replace(" ","").equalsIgnoreCase("Name")) {
                        Shareholder shareholder = new Shareholder(cells.get(0).getText(),
                                cells.get(1).getText(),
                                cells.get(2).getText(),
                                cells.get(3).getText(),
                                company.getName());
                        shareholders.add(shareholder);
                    }
                }
            }
        }
        company.setShareholders(shareholders);
        return new businessDetailsExtractor().extract(company, tables, 2);
    }
}