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
public class Employee implements SuperEntity{

    
    

    
     private String eId;
    private String name;
    private String nic;
    private String gender;
    private String dob;
    private String address;
    private String leId;
    private String TelNo;
    private String dateOfJoining;
    private String eMail;

    public Employee() {
    }

    public Employee(String eId, String name, String address, String gender,  String dob,String TelNo, String dateOfJoining,  String nic,   String eMail, String leId) {

        this.eId = eId;
        this.name = name;
        this.nic = nic;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.leId = leId;
        this.TelNo = TelNo;
        this.dateOfJoining = dateOfJoining;
        this.eMail = eMail;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the TelNo
     */
    public String getTelNo() {
        return TelNo;
    }

    /**
     * @param TelNo the TelNo to set
     */
    public void setTelNo(String TelNo) {
        this.TelNo = TelNo;
    }

    /**
     * @return the dateOfJoining
     */
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * @param dateOfJoining the dateOfJoining to set
     */
    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Employee{" + "eId=" + eId + ", name=" + name + ", nic=" + nic + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", leId=" + leId + ", TelNo=" + TelNo + ", dateOfJoining=" + dateOfJoining + ", eMail=" + eMail + '}';
    }
    
    
}
