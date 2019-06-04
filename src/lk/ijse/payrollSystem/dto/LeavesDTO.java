/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dto;

/**
 *
 * @author acer
 */
public class LeavesDTO {
   private String levId;
   private String eId;
   private String empname;
   private String level;
   private String type;
   private String month;
   private String totalLeave;
   private String datesOfLeaves;
   private String balanceLeave;

    public LeavesDTO() {
    }

    public LeavesDTO(String levId, String eId, String empname, String level, String type, String month, String totalLeave, String datesOfLeaves, String balanceLeave) {
        this.levId = levId;
        this.eId = eId;
        this.empname = empname;
        this.level = level;
        this.type = type;
        this.month = month;
        this.totalLeave = totalLeave;
        this.datesOfLeaves = datesOfLeaves;
        this.balanceLeave = balanceLeave;
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
     * @return the totalLeave
     */
    public String getTotalLeave() {
        return totalLeave;
    }

    /**
     * @param totalLeave the totalLeave to set
     */
    public void setTotalLeave(String totalLeave) {
        this.totalLeave = totalLeave;
    }

    /**
     * @return the datesOfLeaves
     */
    public String getDatesOfLeaves() {
        return datesOfLeaves;
    }

    /**
     * @param datesOfLeaves the datesOfLeaves to set
     */
    public void setDatesOfLeaves(String datesOfLeaves) {
        this.datesOfLeaves = datesOfLeaves;
    }

    /**
     * @return the balanceLeave
     */
    public String getBalanceLeave() {
        return balanceLeave;
    }

    /**
     * @param balanceLeave the balanceLeave to set
     */
    public void setBalanceLeave(String balanceLeave) {
        this.balanceLeave = balanceLeave;
    }

    @Override
    public String toString() {
        return "LeavesDTO{" + "levId=" + levId + ", eId=" + eId + ", empname=" + empname + ", level=" + level + ", type=" + type + ", month=" + month + ", totalLeave=" + totalLeave + ", datesOfLeaves=" + datesOfLeaves + ", balanceLeave=" + balanceLeave + '}';
    }
   
    
}
