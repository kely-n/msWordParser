
/* Dev Kelyn created the file on 2021-02-21 inside the package - PACKAGE_NAME */

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ParseDocument {
    public static void main(String[] args) throws IOException {

        String fileName = "/home/sheis/Downloads/Sample.docx";
            ///home/sheis/Downloads/SOCIEDADE_NACIONAL_-Sample3.docx
            ///home/sheis/Documents/example.docx

        int j = 0;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XWPFDocument xdoc =new XWPFDocument(OPCPackage.open(fis));
            Iterator<XWPFTable> tableElementIterator = xdoc.getTablesIterator();

            while(tableElementIterator.hasNext()) {
                j++;
                System.out.println();
                XWPFTable table = tableElementIterator.next();
                System.out.println("table: " +j + " - " +table.getNumberOfRows()+ " Rows");
                System.out.println(table.getText());

            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("looped " + j +" times");
    }
}
