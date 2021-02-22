package models;

import java.util.List;

/**
 * the Company class is a model representation for the whole document.
 *
 */
public class Company {

    private String name;
    private String principalAddress;
    private String telephone;
    private String fax;
    private String email;
    private String website;
    private String established;
    private String registration;
    private String legalForm;
    private String stockListing;
    private String workForceYear;
    private String workForceNumber;
    private String headOffices;
    private String branches;
    private String tradeName;
    private String nationalId;
    private String vatNumber;

    private BusinessDetails businessDetails;
    private List<Shareholder> shareholders;
    private List<Director> directors;

    private FinancialPeriod financialPeriod;
    private CashFlow cashFlowStatements;
    private BalanceSheet balanceSheets;
    private IncomeStatement incomeStatements;

    public Company(){

    }
    public Company(
            String name, String principalAddress, String telephone, String fax, String email,
            String website, String established, String registration, String legalForm, String stockListing,
            String workForceYear, String  workForceNumber, String headOffices, String branches, String tradeName, String nationalId,
            String vatNumber)
    {
        this.name = name;
        this.principalAddress = principalAddress;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.established = established;
        this.registration = registration;
        this.legalForm = legalForm;
        this.stockListing = stockListing;
        this.workForceYear = workForceYear;
        this.workForceNumber = workForceNumber;
        this.headOffices = headOffices;
        this.branches = branches;
        this.tradeName = tradeName;
        this.nationalId = nationalId;
        this.vatNumber = vatNumber;
    }
    public Company(
            String name, String principalAddress, String telephone, String fax, String email,
            String website, String established, String registration, String legalForm, String stockListing,
            String workForceYear, String  workForceNumber, String headOffices, String branches, String tradeName, String nationalId,
            String vatNumber, BusinessDetails businessDetails, List<Shareholder> shareholders, List<Director> directors,
            FinancialPeriod financialPeriod, CashFlow cashFlowStatements, BalanceSheet balanceSheets,
            IncomeStatement incomeStatements)
    {

        this.name = name;
        this.principalAddress = principalAddress;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.established = established;
        this.registration = registration;
        this.legalForm = legalForm;
        this.stockListing = stockListing;
        this.workForceYear = workForceYear;
        this.workForceNumber = workForceNumber;
        this.headOffices = headOffices;
        this.branches = branches;
        this.tradeName = tradeName;
        this.nationalId = nationalId;
        this.vatNumber = vatNumber;
        this.businessDetails = businessDetails;
        this.shareholders = shareholders;
        this.directors = directors;
        this.cashFlowStatements = cashFlowStatements;
        this.balanceSheets = balanceSheets;
        this.incomeStatements = incomeStatements;
        this.financialPeriod = financialPeriod;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipalAddress() {
        return principalAddress;
    }

    public void setPrincipalAddress(String principalAddress) {
        this.principalAddress = principalAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    public String getStockListing() {
        return stockListing;
    }

    public void setStockListing(String stockListing) {
        this.stockListing = stockListing;
    }

    public String getWorkForceYear() {
        return workForceYear;
    }

    public String getWorkForceNumber() {
        return workForceNumber;
    }

    public void setWorkForceNumber(String workForceNumber) {
        this.workForceNumber = workForceNumber;
    }

    public void setWorkForceYear(String workForceYear) {
        this.workForceYear = workForceYear;
    }

    public String getHeadOffices() {
        return headOffices;
    }

    public void setHeadOffices(String headOffices) {
        this.headOffices = headOffices;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public List<Shareholder> getShareholders() {
        return shareholders;
    }

    public void setShareholders(List<Shareholder> shareholders) {
        this.shareholders = shareholders;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public FinancialPeriod getFinancialPeriod() {
        return financialPeriod;
    }

    public void setFinancialPeriod(FinancialPeriod financialPeriod) {
        this.financialPeriod = financialPeriod;
    }

    public CashFlow getCashFlowStatements() {
        return cashFlowStatements;
    }

    public void setCashFlowStatements(CashFlow cashFlowStatements) {
        this.cashFlowStatements = cashFlowStatements;
    }

    public BalanceSheet getBalanceSheets() {
        return balanceSheets;
    }

    public void setBalanceSheets(BalanceSheet balanceSheets) {
        this.balanceSheets = balanceSheets;
    }

    public IncomeStatement getIncomeStatements() {
        return incomeStatements;
    }

    public void setIncomeStatements(IncomeStatement incomeStatements) {
        this.incomeStatements = incomeStatements;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", principalAddress='" + principalAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", established='" + established + '\'' +
                ", registration='" + registration + '\'' +
                ", legalForm='" + legalForm + '\'' +
                ", stockListing='" + stockListing + '\'' +
                ", workForceYear='" + workForceYear + '\'' +
                ", workForceNumber='" + workForceNumber + '\'' +
                ", headOffices='" + headOffices + '\'' +
                ", branches='" + branches + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", businessDetails='" + businessDetails + '\'' +
                ", shareholders='" + shareholders + '\'' +
                '}';
    }
}
