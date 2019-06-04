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
public class CustomEntity implements SuperEntity{
    
    
    private String salId;
    private String year;
    private String month;
    private String salaryType;
    private BigDecimal amount;
    
    private String eId;
    private String eName;
     private BigDecimal basicsalaryAmount;
    private BigDecimal grossDeduction;
    private String levelName;
    private BigDecimal grossSalary;
    private String sId;
    private BigDecimal loanAmount;
    private BigDecimal epf;
    private String date;
    private BigDecimal damage;
    private BigDecimal nopay;

    public CustomEntity() {
    }

    public CustomEntity(String salId, String year, String month, String salaryType, BigDecimal amount, String eId, String eName, BigDecimal basicsalaryAmount, BigDecimal grossDeduction, String levelName, BigDecimal grossSalary, String sId, BigDecimal loanAmount, BigDecimal epf, String date, BigDecimal damage, BigDecimal nopay) {
        this.salId = salId;
        this.year = year;
        this.month = month;
        this.salaryType = salaryType;
        this.amount = amount;
        this.eId = eId;
        this.eName = eName;
        this.basicsalaryAmount = basicsalaryAmount;
        this.grossDeduction = grossDeduction;
        this.levelName = levelName;
        this.grossSalary = grossSalary;
        this.sId = sId;
        this.loanAmount = loanAmount;
        this.epf = epf;
        this.date = date;
        this.damage = damage;
        this.nopay = nopay;
    }

    /**
     * @return the salId
     */
    public String getSalId() {
        return salId;
    }

    /**
     * @param salId the salId to set
     */
    public void setSalId(String salId) {
        this.salId = salId;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the salaryType
     */
    public String getSalaryType() {
        return salaryType;
    }

    /**
     * @param salaryType the salaryType to set
     */
    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
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
     * @return the basicsalaryAmount
     */
    public BigDecimal getBasicsalaryAmount() {
        return basicsalaryAmount;
    }

    /**
     * @param basicsalaryAmount the basicsalaryAmount to set
     */
    public void setBasicsalaryAmount(BigDecimal basicsalaryAmount) {
        this.basicsalaryAmount = basicsalaryAmount;
    }

    /**
     * @return the grossDeduction
     */
    public BigDecimal getGrossDeduction() {
        return grossDeduction;
    }

    /**
     * @param grossDeduction the grossDeduction to set
     */
    public void setGrossDeduction(BigDecimal grossDeduction) {
        this.grossDeduction = grossDeduction;
    }

    /**
     * @return the levelName
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * @param levelName the levelName to set
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * @return the grossSalary
     */
    public BigDecimal getGrossSalary() {
        return grossSalary;
    }

    /**
     * @param grossSalary the grossSalary to set
     */
    public void setGrossSalary(BigDecimal grossSalary) {
        this.grossSalary = grossSalary;
    }

    /**
     * @return the sId
     */
    public String getsId() {
        return sId;
    }

    /**
     * @param sId the sId to set
     */
    public void setsId(String sId) {
        this.sId = sId;
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
     * @return the epf
     */
    public BigDecimal getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(BigDecimal epf) {
        this.epf = epf;
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
     * @return the damage
     */
    public BigDecimal getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(BigDecimal damage) {
        this.damage = damage;
    }

    /**
     * @return the nopay
     */
    public BigDecimal getNopay() {
        return nopay;
    }

    /**
     * @param nopay the nopay to set
     */
    public void setNopay(BigDecimal nopay) {
        this.nopay = nopay;
    }
    
    

}
