package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

import java.util.List;

/**
 *
 */
public class BalanceSheet {
   private List<CashRecord> nonCurrent_assets;
    private List<CashRecord> current_assets;
    private List<CashRecord> nonCurrent_eq_liabilities;
    private List<CashRecord> current_eq_liabilities;
    private List<CashRecord> capitalReserves;

    public BalanceSheet(List<CashRecord> nonCurrent_assets, List<CashRecord> current_assets, List<CashRecord> nonCurrent_eq_liabilities, List<CashRecord> current_eq_liabilities, List<CashRecord> capitalReserves) {
        this.nonCurrent_assets = nonCurrent_assets;
        this.current_assets = current_assets;
        this.nonCurrent_eq_liabilities = nonCurrent_eq_liabilities;
        this.current_eq_liabilities = current_eq_liabilities;
        this.capitalReserves = capitalReserves;
    }

    public List<CashRecord> getNonCurrent_assets() {
        return nonCurrent_assets;
    }

    public void setNonCurrent_assets(List<CashRecord> nonCurrent_assets) {
        this.nonCurrent_assets = nonCurrent_assets;
    }

    public List<CashRecord> getCurrent_assets() {
        return current_assets;
    }

    public void setCurrent_assets(List<CashRecord> current_assets) {
        this.current_assets = current_assets;
    }

    public List<CashRecord> getNonCurrent_eq_liabilities() {
        return nonCurrent_eq_liabilities;
    }

    public void setNonCurrent_eq_liabilities(List<CashRecord> nonCurrent_eq_liabilities) {
        this.nonCurrent_eq_liabilities = nonCurrent_eq_liabilities;
    }

    public List<CashRecord> getCurrent_eq_liabilities() {
        return current_eq_liabilities;
    }

    public void setCurrent_eq_liabilities(List<CashRecord> current_eq_liabilities) {
        this.current_eq_liabilities = current_eq_liabilities;
    }

    public List<CashRecord> getCapitalReserves() {
        return capitalReserves;
    }

    public void setCapitalReserves(List<CashRecord> capitalReserves) {
        this.capitalReserves = capitalReserves;
    }
}
