package models;

/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

/**
 *
 */
public class BusinessDetails {
    private String nominalCapital;
    private String subscribedCapital;
    private String creditOpinion;
    private String cooperateCreditRating;
    private String customers;
    private String recentSales;
    private String exports;
    private String exportRatio;
    private String imports;
    private String importRatio;
    private String companyHistory;
    private String businessActivities;
    private String buyingTerms;
    private String sellingTerms;
    private String suppliers;
    private String domesticMarketShare;
    private String businessPremises;
    private String TypeOfOccupation;
    private String Location;
    private String premisesUsedAs;
    private String mainBanks;
    private String paymentMorale;
    private String creditRating;
    private String comments;
    private String companyName;
    public BusinessDetails(String nominalCapital, String subscribedCapital, String creditOpinion,
                           String cooperateCreditRating, String customers, String recentSales, String exports,
                           String exportRatio, String imports, String importRatio, String companyHistory,
                           String businessActivities, String buyingTerms, String sellingTerms, String suppliers,
                           String domesticMarketShare, String businessPremises, String typeOfOccupation,
                           String location, String premisesUsedAs, String mainBanks, String paymentMorale,
                           String creditRating, String comments, String companyName)
    {
        this.nominalCapital = nominalCapital;
        this.subscribedCapital = subscribedCapital;
        this.creditOpinion = creditOpinion;
        this.cooperateCreditRating = cooperateCreditRating;
        this.customers = customers;
        this.recentSales = recentSales;
        this.exports = exports;
        this.exportRatio = exportRatio;
        this.imports = imports;
        this.importRatio = importRatio;
        this.companyHistory = companyHistory;
        this.businessActivities = businessActivities;
        this.buyingTerms = buyingTerms;
        this.sellingTerms = sellingTerms;
        this.suppliers = suppliers;
        this.domesticMarketShare = domesticMarketShare;
        this.businessPremises = businessPremises;
        TypeOfOccupation = typeOfOccupation;
        Location = location;
        this.premisesUsedAs = premisesUsedAs;
        this.mainBanks = mainBanks;
        this.paymentMorale = paymentMorale;
        this.creditRating = creditRating;
        this.comments = comments;
        this.companyName = companyName;
    }

    public BusinessDetails() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNominalCapital() {
        return nominalCapital;
    }

    public void setNominalCapital(String nominalCapital) {
        this.nominalCapital = nominalCapital;
    }

    public String getSubscribedCapital() {
        return subscribedCapital;
    }

    public void setSubscribedCapital(String subscribedCapital) {
        this.subscribedCapital = subscribedCapital;
    }

    public String getCreditOpinion() {
        return creditOpinion;
    }

    public void setCreditOpinion(String creditOpinion) {
        this.creditOpinion = creditOpinion;
    }

    public String getCooperateCreditRating() {
        return cooperateCreditRating;
    }

    public void setCooperateCreditRating(String cooperateCreditRating) {
        this.cooperateCreditRating = cooperateCreditRating;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getRecentSales() {
        return recentSales;
    }

    public void setRecentSales(String recentSales) {
        this.recentSales = recentSales;
    }

    public String getExports() {
        return exports;
    }

    public void setExports(String exports) {
        this.exports = exports;
    }

    public String getExportRatio() {
        return exportRatio;
    }

    public void setExportRatio(String exportRatio) {
        this.exportRatio = exportRatio;
    }

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public String getImportRatio() {
        return importRatio;
    }

    public void setImportRatio(String importRatio) {
        this.importRatio = importRatio;
    }

    public String getCompanyHistory() {
        return companyHistory;
    }

    public void setCompanyHistory(String companyHistory) {
        this.companyHistory = companyHistory;
    }

    public String getBusinessActivities() {
        return businessActivities;
    }

    public void setBusinessActivities(String businessActivities) {
        this.businessActivities = businessActivities;
    }

    public String getBuyingTerms() {
        return buyingTerms;
    }

    public void setBuyingTerms(String buyingTerms) {
        this.buyingTerms = buyingTerms;
    }

    public String getSellingTerms() {
        return sellingTerms;
    }

    public void setSellingTerms(String sellingTerms) {
        this.sellingTerms = sellingTerms;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public String getDomesticMarketShare() {
        return domesticMarketShare;
    }

    public void setDomesticMarketShare(String domesticMarketShare) {
        this.domesticMarketShare = domesticMarketShare;
    }

    public String getBusinessPremises() {
        return businessPremises;
    }

    public void setBusinessPremises(String businessPremises) {
        this.businessPremises = businessPremises;
    }

    public String getTypeOfOccupation() {
        return TypeOfOccupation;
    }

    public void setTypeOfOccupation(String typeOfOccupation) {
        TypeOfOccupation = typeOfOccupation;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getPremisesUsedAs() {
        return premisesUsedAs;
    }

    public void setPremisesUsedAs(String premisesUsedAs) {
        this.premisesUsedAs = premisesUsedAs;
    }

    public String getMainBanks() {
        return mainBanks;
    }

    public void setMainBanks(String mainBanks) {
        this.mainBanks = mainBanks;
    }

    public String getPaymentMorale() {
        return paymentMorale;
    }

    public void setPaymentMorale(String paymentMorale) {
        this.paymentMorale = paymentMorale;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "BusinessDetails{" +
                "nominalCapital='" + nominalCapital + '\'' +
                ", subscribedCapital='" + subscribedCapital + '\'' +
                ", creditOpinion='" + creditOpinion + '\'' +
                ", cooperateCreditRating='" + cooperateCreditRating + '\'' +
                ", customers='" + customers + '\'' +
                ", recentSales='" + recentSales + '\'' +
                ", exports='" + exports + '\'' +
                ", exportRatio='" + exportRatio + '\'' +
                ", imports='" + imports + '\'' +
                ", importRatio='" + importRatio + '\'' +
                ", companyHistory='" + companyHistory + '\'' +
                ", businessActivities='" + businessActivities + '\'' +
                ", buyingTerms='" + buyingTerms + '\'' +
                ", sellingTerms='" + sellingTerms + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", domesticMarketShare='" + domesticMarketShare + '\'' +
                ", businessPremises='" + businessPremises + '\'' +
                ", TypeOfOccupation='" + TypeOfOccupation + '\'' +
                ", Location='" + Location + '\'' +
                ", premisesUsedAs='" + premisesUsedAs + '\'' +
                ", mainBanks='" + mainBanks + '\'' +
                ", paymentMorale='" + paymentMorale + '\'' +
                ", creditRating='" + creditRating + '\'' +
                ", comments='" + comments + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
