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
public class SalaryDTO {
    private String salId;
    private String eId;
    private String ename;
    private String level;
  private String salaryType;
  private BigDecimal amount;
 private String date;

    public SalaryDTO() {
    }

    public SalaryDTO(String salId, String eId, String ename, String level, String salaryType, BigDecimal amount, String date) {
        this.salId = salId;
        this.eId = eId;
        this.ename = ename;
        this.level = level;
        this.salaryType = salaryType;
        this.amount = amount;
        this.date = date;
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
     * @return the ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename the ename to set
     */
    public void setEname(String ename) {
        this.ename = ename;
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

    @Override
    public String toString() {
        return "SalaryDTO{" + "salId=" + salId + ", eId=" + eId + ", ename=" + ename + ", level=" + level + ", salaryType=" + salaryType + ", amount=" + amount + ", date=" + date + '}';
    }

  

}