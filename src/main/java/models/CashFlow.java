package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

import java.util.List;

/**
 *
 */
public class CashFlow {
    private List<CashRecord> operatingActivities;
    private List<CashRecord> financingActivities;
    private List<CashRecord> investingActivities;

    public CashFlow(List<CashRecord> operatingActivities, List<CashRecord> financingActivities, List<CashRecord> investingActivities) {
        this.operatingActivities = operatingActivities;
        this.financingActivities = financingActivities;
        this.investingActivities = investingActivities;
    }

    public List<CashRecord> getOperatingActivities() {
        return operatingActivities;
    }

    public void setOperatingActivities(List<CashRecord> operatingActivities) {
        this.operatingActivities = operatingActivities;
    }

    public List<CashRecord> getFinancingActivities() {
        return financingActivities;
    }

    public void setFinancingActivities(List<CashRecord> financingActivities) {
        this.financingActivities = financingActivities;
    }

    public List<CashRecord> getInvestingActivities() {
        return investingActivities;
    }

    public void setInvestingActivities(List<CashRecord> investingActivities) {
        this.investingActivities = investingActivities;
    }


}
