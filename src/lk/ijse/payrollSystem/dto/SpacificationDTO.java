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
public class SpacificationDTO {
    private String sId;
    private String inTId;
    private String lcId;
    private String epfRId;

    public SpacificationDTO() {
    }

    public SpacificationDTO(String sId, String inTId, String lcId, String epfRId) {
        this.sId = sId;
        this.inTId = inTId;
        this.lcId = lcId;
        this.epfRId = epfRId;
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
     * @return the inTId
     */
    public String getInTId() {
        return inTId;
    }

    /**
     * @param inTId the inTId to set
     */
    public void setInTId(String inTId) {
        this.inTId = inTId;
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
     * @return the epfRId
     */
    public String getEpfRId() {
        return epfRId;
    }

    /**
     * @param epfRId the epfRId to set
     */
    public void setEpfRId(String epfRId) {
        this.epfRId = epfRId;
    }

    @Override
    public String toString() {
        return "SpacificationDTO{" + "sId=" + sId + ", inTId=" + inTId + ", lcId=" + lcId + ", epfRId=" + epfRId + '}';
    }
     
    
    
}
