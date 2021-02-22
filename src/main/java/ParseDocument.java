
/* Dev Kelyn created the file on 2021-02-21 inside the package - PACKAGE_NAME */

import extractror.CompanyExtractor;
import models.Company;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.*;

import javax.swing.text.TableView;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ParseDocument {
    public static void main(String[] args) throws IOException {

        String fileName = "/home/sheis/Downloads/SOCIEDADE_NACIONAL_-Sample3.docx";
            ///home/sheis/Downloads/SOCIEDADE_NACIONAL_-Sample3.docx
            ///home/sheis/Documents/example.docx

        int j = 0;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XWPFDocument xdoc =new XWPFDocument(OPCPackage.open(fis));
            List<XWPFTable> tables = xdoc.getTables();
            CompanyExtractor companyExtractor = new CompanyExtractor();
            Company company = new Company();

            company = companyExtractor.extract(company, tables, 1);
            System.out.println(company);

//            for(XWPFTable table: tables) {
//                System.out.println("table No: " + ++j);
//
//            }
//            while(tableElementIterator.hasNext()) {
//                j++;
//                System.out.println();
//                XWPFTable table = tableElementIterator.next();
//                System.out.println("table: " +j + " - " +table.getNumberOfRows()+ " Rows");
//                for(int i = 0; i< table.getNumberOfRows(); i++){
//                    XWPFTableRow row = table.getRow(i);
//                    List<XWPFTableCell> cells = row.getTableCells();
//                    for(XWPFTableCell cell : cells)
//                        System.out.println(cell.getText());
//                }
//                System.out.println(table.getText());
//
//            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
