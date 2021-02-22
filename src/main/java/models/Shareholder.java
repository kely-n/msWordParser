package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

/**
 *
 */
public class Shareholder {
    private Integer id;
    private String name;
    private String position;
    private String amount;
    private String ratio;
    private String  company_name;

    public Shareholder(Integer id, String name, String position, String amount, String ratio, String company_name) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.amount = amount;
        this.ratio = ratio;
        this.company_name = company_name;
    }

    public Shareholder(String name, String position, String amount, String ratio, String company_name) {
        this.name = name;
        this.position = position;
        this.amount = amount;
        this.ratio = ratio;
        this.company_name = company_name;
    }
    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String companyName) {
        this.company_name = company_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "Shareholder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", amount='" + amount + '\'' +
                ", ratio='" + ratio + '\'' +
                ", companyName='" + company_name + '\'' +
                '}';
    }
}
