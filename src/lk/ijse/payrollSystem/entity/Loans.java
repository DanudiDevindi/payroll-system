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
public class Loans implements SuperEntity{
   private String lId; 
   private String eId;
   private String eName;
   private String level;
   private BigDecimal loanAmount;
   private String date;
   private String due;
   private Double interest;
   private BigDecimal total;

    public Loans() {
    }

    public Loans(String lId, String eId, String eName, String level, BigDecimal loanAmount, String date, String due, Double interest, BigDecimal total) {
        this.lId = lId;
        this.eId = eId;
        this.eName = eName;
        this.level = level;
        this.loanAmount = loanAmount;
        this.date = date;
        this.due = due;
        this.interest = interest;
        this.total = total;
    }

    /**
     * @return the lId
     */
    public String getlId() {
        return lId;
    }

    /**
     * @param lId the lId to set
     */
    public void setlId(String lId) {
        this.lId = lId;
    }

    /**
     * @return the eId
     */
    public String geteId() {
        return eId;
    }

    /**
     * @param eId the eId to set
     */
    public void seteId(String eId) {
        this.eId = eId;
    }

    /**
     * @return the eName
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName the eName to set
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Loans{" + "lId=" + lId + ", eId=" + eId + ", eName=" + eName + ", level=" + level + ", loanAmount=" + loanAmount + ", date=" + date + ", due=" + due + ", interest=" + interest + ", total=" + total + '}';
    }
   

  
}
