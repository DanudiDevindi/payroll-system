/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.entity;

import java.math.BigDecimal;

/**
 *
 * @author acer
 */
public class ETFRate implements SuperEntity{
     private String etfId;
    private BigDecimal amount;
    private Double presentage;

    public ETFRate() {
    }

    public ETFRate(String etfId, BigDecimal amount, Double presentage) {
        this.etfId = etfId;
        this.amount = amount;
        this.presentage = presentage;
    }

    /**
     * @return the etfId
     */
    public String getEtfId() {
        return etfId;
    }

    /**
     * @param etfId the etfId to set
     */
    public void setEtfId(String etfId) {
        this.etfId = etfId;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the presentage
     */
    public Double getPresentage() {
        return presentage;
    }

    /**
     * @param presentage the presentage to set
     */
    public void setPresentage(Double presentage) {
        this.presentage = presentage;
    }

    @Override
    public String toString() {
        return "ETFRate{" + "etfId=" + etfId + ", amount=" + amount + ", presentage=" + presentage + '}';
    }
    
    
}
