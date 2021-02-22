package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

/**
 *
 */
public class FinancialPeriod {
    public String companyName;
    public String date1;
    public String date2;
    public String date3;

    public FinancialPeriod(String companyName, String date1, String date2, String date3) {
        this.companyName = companyName;
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
    }
    public FinancialPeriod(String companyName, String date1, String date2) {
        this.companyName = companyName;
        this.date1 = date1;
        this.date2 = date2;
    }

    public FinancialPeriod(String companyName, String date1) {
        this.companyName = companyName;
        this.date1 = date1;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    @Override
    public String toString() {
        return "FinancialPeriod{" +
                "companyName='" + companyName + '\'' +
                ", date1='" + date1 + '\'' +
                ", date2='" + date2 + '\'' +
                ", date3='" + date3 + '\'' +
                '}';
    }
}
