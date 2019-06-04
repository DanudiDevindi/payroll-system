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
public class Attendance implements SuperEntity{
     private String aId;
    private String eId;
    private String inTime;
    private String outTime;
    private String date;

    public Attendance() {
    }

    public Attendance(String aId, String eId, String inTime, String outTime, String date) {
        this.aId = aId;
        this.eId = eId;
        this.inTime = inTime;
        this.outTime = outTime;
        this.date = date;
    }

    /**
     * @return the aId
     */
    public String getaId() {
        return aId;
    }

    /**
     * @param aId the aId to set
     */
    public void setaId(String aId) {
        this.aId = aId;
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
     * @return the inTime
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * @param inTime the inTime to set
     */
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * @return the outTime
     */
    public String getOutTime() {
        return outTime;
    }

    /**
     * @param outTime the outTime to set
     */
    public void setOutTime(String outTime) {
        this.outTime = outTime;
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
        return "attendance{" + "aId=" + aId + ", eId=" + eId + ", inTime=" + inTime + ", outTime=" + outTime + ", date=" + date + '}';
    }
    
    
}
