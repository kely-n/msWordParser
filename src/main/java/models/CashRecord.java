package models;
/* Dev Kelyn created the file on 2021-02-17 inside the package - com.companyprofiles.chuna.models */

/**
 *
 */
public class CashRecord {
    private Integer id;
    private String type;
    private String description;
    private String period1;
    private String period2;
    private String period3;
    private String companyName;

    public CashRecord(Integer id, String type, String description, String period1, String period2, String period3, String companyName) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.period1 = period1;
        this.period2 = period2;
        this.period3 = period3;
        this.companyName = companyName;
    }

    public CashRecord(String type, String description, String period1, String period2, String period3, String companyName) {
        this.type = type;
        this.description = description;
        this.period1 = period1;
        this.period2 = period2;
        this.period3 = period3;
        this.companyName = companyName;
    }

    public CashRecord(String type, String description, String period1, String period2, String companyName) {
        this.type = type;
        this.description = description;
        this.period1 = period1;
        this.period2 = period2;
        this.companyName = companyName;
    }

    public CashRecord(String type, String description, String period1, String companyName) {
        this.type = type;
        this.description = description;
        this.period1 = period1;
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeriod1() {
        return period1;
    }

    public void setPeriod1(String period1) {
        this.period1 = period1;
    }

    public String getPeriod2() {
        return period2;
    }

    public void setPeriod2(String period2) {
        this.period2 = period2;
    }

    public String getPeriod3() {
        return period3;
    }

    public void setPeriod3(String period3) {
        this.period3 = period3;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CashRecord{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", period1='" + period1 + '\'' +
                ", period2='" + period2 + '\'' +
                ", period3='" + period3 + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
