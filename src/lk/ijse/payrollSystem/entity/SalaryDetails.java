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
public class SalaryDetails implements SuperEntity {
     private String sdId;
    private String empId;
    private String empname;
    private String level;
    private BigDecimal basicSalaryAmount;
    private String salId;
    private String date;
    private BigDecimal noPay;
    private BigDecimal loan;
    private BigDecimal damages;
    private BigDecimal epf;
    private BigDecimal grossDeduction;
    private BigDecimal netSalary;

    public SalaryDetails() {
    }

    public SalaryDetails(String sdId, String empId, String empname, String level, BigDecimal basicSalaryAmount, String salId, String date, BigDecimal noPay, BigDecimal loan, BigDecimal damages, BigDecimal epf, BigDecimal grossDeduction, BigDecimal netSalary) {
        this.sdId = sdId;
        this.empId = empId;
        this.empname = empname;
        this.level = level;
        this.basicSalaryAmount = basicSalaryAmount;
        this.salId = salId;
        this.date = date;
        this.noPay = noPay;
        this.loan = loan;
        this.damages = damages;
        this.epf = epf;
        this.grossDeduction = grossDeduction;
        this.netSalary = netSalary;
    }

    /**
     * @return the sdId
     */
    public String getSdId() {
        return sdId;
    }

    /**
     * @param sdId the sdId to set
     */
    public void setSdId(String sdId) {
        this.sdId = sdId;
    }

    /**
     * @return the empId
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * @return the empname
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * @param empname the empname to set
     */
    public void setEmpname(String empname) {
        this.empname = empname;
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
     * @return the basicSalaryAmount
     */
    public BigDecimal getBasicSalaryAmount() {
        return basicSalaryAmount;
    }

    /**
     * @param basicSalaryAmount the basicSalaryAmount to set
     */
    public void setBasicSalaryAmount(BigDecimal basicSalaryAmount) {
        this.basicSalaryAmount = basicSalaryAmount;
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
     * @return the noPay
     */
    public BigDecimal getNoPay() {
        return noPay;
    }

    /**
     * @param noPay the noPay to set
     */
    public void setNoPay(BigDecimal noPay) {
        this.noPay = noPay;
    }

    /**
     * @return the loan
     */
    public BigDecimal getLoan() {
        return loan;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(BigDecimal loan) {
        this.loan = loan;
    }

    /**
     * @return the damages
     */
    public BigDecimal getDamages() {
        return damages;
    }

    /**
     * @param damages the damages to set
     */
    public void setDamages(BigDecimal damages) {
        this.damages = damages;
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
     * @return the netSalary
     */
    public BigDecimal getNetSalary() {
        return netSalary;
    }

    /**
     * @param netSalary the netSalary to set
     */
    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "SalaryDetails{" + "sdId=" + sdId + ", empId=" + empId + ", empname=" + empname + ", level=" + level + ", basicSalaryAmount=" + basicSalaryAmount + ", salId=" + salId + ", date=" + date + ", noPay=" + noPay + ", loan=" + loan + ", damages=" + damages + ", epf=" + epf + ", grossDeduction=" + grossDeduction + ", netSalary=" + netSalary + '}';
    }

     


   
}
