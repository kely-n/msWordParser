package models;
/* Dev Kelyn created the file on 2021-02-13 inside the package - com.companyprofiles.chuna.models */

import java.util.List;

/**
 *
 */
public class IncomeStatement {
    private List<CashRecord> turnover;
    private List<CashRecord> costOfSales;
    private List<CashRecord> overheads;
    private List<CashRecord> loss;
    private List<CashRecord> taxation;

    public IncomeStatement(List<CashRecord> turnover, List<CashRecord> costOfSales, List<CashRecord> overheads, List<CashRecord> loss, List<CashRecord> taxation) {
        this.turnover = turnover;
        this.costOfSales = costOfSales;
        this.overheads = overheads;
        this.loss = loss;
        this.taxation = taxation;
    }

    public List<CashRecord> getTurnover() {
        return turnover;
    }

    public void setTurnover(List<CashRecord> turnover) {
        this.turnover = turnover;
    }

    public List<CashRecord> getCostOfSales() {
        return costOfSales;
    }

    public void setCostOfSales(List<CashRecord> costOfSales) {
        this.costOfSales = costOfSales;
    }

    public List<CashRecord> getOverheads() {
        return overheads;
    }

    public void setOverheads(List<CashRecord> overheads) {
        this.overheads = overheads;
    }

    public List<CashRecord> getLoss() {
        return loss;
    }

    public void setLoss(List<CashRecord> loss) {
        this.loss = loss;
    }

    public List<CashRecord> getTaxation() {
        return taxation;
    }

    public void setTaxation(List<CashRecord> taxation) {
        this.taxation = taxation;
    }
}
