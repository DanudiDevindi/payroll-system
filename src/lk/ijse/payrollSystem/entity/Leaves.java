/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.entity;

/**
 *
 * @author acer
 */
public class Leaves implements SuperEntity{
    private String levId;
    private String eId;
    private String empname;
    private String level;
    private String type;
    private String month;
    private String totalLeaves;
    private String dateOfLeaves;
    private String balanceLeaves;

    public Leaves() {
    }

    public Leaves(String levId, String eId, String empname, String level, String type, String month, String totalLeaves, String dateOfLeaves, String balanceLeaves) {
        this.levId = levId;
        this.eId = eId;
        this.empname = empname;
        this.level = level;
        this.type = type;
        this.month = month;
        this.totalLeaves = totalLeaves;
        this.dateOfLeaves = dateOfLeaves;
        this.balanceLeaves = balanceLeaves;
    }

    /**
     * @return the levId
     */
    public String getLevId() {
        return levId;
    }

    /**
     * @param levId the levId to set
     */
    public void setLevId(String levId) {
        this.levId = levId;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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

    /**
     * @return the dateOfLeaves
     */
    public String getDateOfLeaves() {
        return dateOfLeaves;
    }

    /**
     * @param dateOfLeaves the dateOfLeaves to set
     */
    public void setDateOfLeaves(String dateOfLeaves) {
        this.dateOfLeaves = dateOfLeaves;
    }

    /**
     * @return the balanceLeaves
     */
    public String getBalanceLeaves() {
        return balanceLeaves;
    }

    /**
     * @param balanceLeaves the balanceLeaves to set
     */
    public void setBalanceLeaves(String balanceLeaves) {
        this.balanceLeaves = balanceLeaves;
    }

    @Override
    public String toString() {
        return "Leaves{" + "levId=" + levId + ", eId=" + eId + ", empname=" + empname + ", level=" + level + ", type=" + type + ", month=" + month + ", totalLeaves=" + totalLeaves + ", dateOfLeaves=" + dateOfLeaves + ", balanceLeaves=" + balanceLeaves + '}';
    }
    
    
    
}
