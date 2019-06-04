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
public class EPFRate implements SuperEntity{
     private String epfRId;
    private BigDecimal amount;
    private Double presentage;

    public EPFRate() {
    }

    public EPFRate(String epfRId, BigDecimal amount, Double presentage) {
        this.epfRId = epfRId;
        this.amount = amount;
        this.presentage = presentage;
    }

    /**
     * @return the epfRId
     */
    public String getEpfRId() {
        return epfRId;
    }

    /**
     * @param epfRId the epfRId to set
     */
    public void setEpfRId(String epfRId) {
        this.epfRId = epfRId;
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
        return "EPFRate{" + "epfRId=" + epfRId + ", amount=" + amount + ", presentage=" + presentage + '}';
    }
    

    
}
