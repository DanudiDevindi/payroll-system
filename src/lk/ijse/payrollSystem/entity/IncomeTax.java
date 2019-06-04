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
public class IncomeTax implements SuperEntity{
      private String inTId;
    private BigDecimal amount;
    private Double presentage;

    public IncomeTax() {
    }

    public IncomeTax(String inTId, BigDecimal amount, Double presentage) {
        this.inTId = inTId;
        this.amount = amount;
        this.presentage = presentage;
    }

    /**
     * @return the inTId
     */
    public String getInTId() {
        return inTId;
    }

    /**
     * @param inTId the inTId to set
     */
    public void setInTId(String inTId) {
        this.inTId = inTId;
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
        return "IncomeTax{" + "inTId=" + inTId + ", amount=" + amount + ", presentage=" + presentage + '}';
    }
    
    
}
