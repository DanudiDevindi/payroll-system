/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dto;

import java.math.BigDecimal;

/**
 *
 * @author acer
 */
public class LoanCatagoryDTO {
    private String lcId;
    private String loanType;
    private BigDecimal loanAmount;
    private String due;
    private Double interest;

    public LoanCatagoryDTO() {
    }

    public LoanCatagoryDTO(String lcId, String loanType, BigDecimal loanAmount, String due, Double interest) {
        this.lcId = lcId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.due = due;
        this.interest = interest;
    }

    /**
     * @return the lcId
     */
    public String getLcId() {
        return lcId;
    }

    /**
     * @param lcId the lcId to set
     */
    public void setLcId(String lcId) {
        this.lcId = lcId;
    }

    /**
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * @return the loanAmount
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the due
     */
    public String getDue() {
        return due;
    }

    /**
     * @param due the due to set
     */
    public void setDue(String due) {
        this.due = due;
    }

    /**
     * @return the interest
     */
    public Double getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "LoanCatagoryDTO{" + "lcId=" + lcId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", due=" + due + ", interest=" + interest + '}';
    }
    

  
}
