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
public class Level implements SuperEntity{
     private String leId;
    private String lName;
    private BigDecimal basicSalary;
    private BigDecimal EPFAmount;
    private String totalLeaves;

    public Level() {
    }

    public Level(String lName) {
        this.lName = lName;
    }
    

    public Level(String leId, String lName, BigDecimal basicSalary, BigDecimal EPFAmount, String totalLeaves) {
        this.leId = leId;
        this.lName = lName;
        this.basicSalary = basicSalary;
        this.EPFAmount = EPFAmount;
        this.totalLeaves = totalLeaves;
    }

    /**
     * @return the leId
     */
    public String getLeId() {
        return leId;
    }

    /**
     * @param leId the leId to set
     */
    public void setLeId(String leId) {
        this.leId = leId;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the basicSalary
     */
    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the EPFAmount
     */
    public BigDecimal getEPFAmount() {
        return EPFAmount;
    }

    /**
     * @param EPFAmount the EPFAmount to set
     */
    public void setEPFAmount(BigDecimal EPFAmount) {
        this.EPFAmount = EPFAmount;
    }

    /**
     * @return the totalLeaves
     */
    public String getTotalLeaves() {
        return totalLeaves;
    }

    /**
     * @param totalLeaves the totalLeaves to set
     */
    public void setTotalLeaves(String totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    @Override
    public String toString() {
        return "Level{" + "leId=" + leId + ", lName=" + lName + ", basicSalary=" + basicSalary + ", EPFAmount=" + EPFAmount + ", totalLeaves=" + totalLeaves + '}';
    }

  
}
