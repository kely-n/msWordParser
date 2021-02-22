package extractror;
/* Dev Kelyn created the file on 2021-02-22 inside the package - extractror */

import models.Company;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import java.util.List;

/**
 *
 */

public interface Extractor {
//    Defines next extractor in chain
    void setNext(Extractor extractor);
    Company extract(Company company, List<XWPFTable> tables, int tableNumber);
}
