package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

/**
 *
 */
public class Director {
    private Integer id;
    private String name;
    private String post;
    private String remarks;
    private String otherDirectorships;
    private String Education;
    private String country;
    public String companyName;
    public Director(){
    }
    public Director(Integer id, String name, String post, String remarks,
                    String otherDirectorships, String education, String country , String companyName)
    {
        this.id = id;
        this.name = name;
        this.post = post;
        this.remarks = remarks;
        this.otherDirectorships = otherDirectorships;
        Education = education;
        this.country = country;
        this.companyName = companyName;
    }
    public Director( String name, String post, String remarks,
                    String otherDirectorships, String education, String country , String companyName)
    {
        this.name = name;
        this.post = post;
        this.remarks = remarks;
        this.otherDirectorships = otherDirectorships;
        Education = education;
        this.country = country;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOtherDirectorships() {
        return otherDirectorships;
    }

    public void setOtherDirectorships(String otherDirectorships) {
        this.otherDirectorships = otherDirectorships;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", remarks='" + remarks + '\'' +
                ", otherDirectorships='" + otherDirectorships + '\'' +
                ", Education='" + Education + '\'' +
                ", country='" + country + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
