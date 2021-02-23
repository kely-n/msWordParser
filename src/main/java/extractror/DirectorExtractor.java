package extractror;
/* Dev Kelyn created the file on 2021-02-22 inside the package - extractror */

import models.BusinessDetails;
import models.Company;
import models.Director;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class DirectorExtractor implements Extractor{
    private Extractor extractor;

    @Override
    public void setNext(Extractor extractor) {
        this.extractor = extractor;
    }

    @Override
    public Company extract(Company company, List<XWPFTable> tables, int tableNumber) {
        List<Director> directors = new ArrayList<>();

        for (int j = 5; j < 16; j++) {
            XWPFTable table = tables.get(j);

            for (int i = 0; i < table.getNumberOfRows(); i++) {
                XWPFTableRow row = table.getRow(i);
                List<XWPFTableCell> cells = row.getTableCells();
                String cellText = cells.get(0).getText().replace(" ", "");

                if(isDirector(cellText)) {//if you find a director table
                    //create new Director
                    Director director = new Director();

                    //iterate rows after the President/CEO heading populating data
                    for(int count = i+1; count<table.getNumberOfRows(); count++){

                        //check if its end of table; if not end of table populate data
                        String rowCellText = table.getRow(count).getTableCells().get(0).getText();
                        if(!isDirector(rowCellText)){
                            switch (rowCellText.replace(" ", "").replace(":","")){
                                case "Name":
                                    director.setName(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                case "CurrentTitle":
                                    director.setPost(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                case "Remarks":
                                    director.setRemarks(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                case "OtherDirectorships":
                                    director.setOtherDirectorships(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                case "EducationalQualification":
                                    director.setEducation(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                case "Countryofresidence":
                                    director.setCountry(table.getRow(count).getTableCells().get(1).getText());
                                    break;
                                default:
                                    break;

                            }
                        }
                    }
                    //add director to directors list

                    directors.add(director);
                }
            }

        }
        company.setDirectors(directors);
        return company;
    }

    private boolean isDirector(String cellText){
        return (cellText.contains("President/CEO") && cellText.length()<20 //if it contains word president/CEO
                || cellText.contains("Director(" )&& cellText.length()<20// if it contains word Directors(
        );
    }
}