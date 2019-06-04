/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.BoFactory;
import lk.ijse.payrollSystem.business.custom.AttendanceBo;
import lk.ijse.payrollSystem.business.custom.EmployeeBo;
import lk.ijse.payrollSystem.business.custom.impl.AttendanceBoImpl;
import lk.ijse.payrollSystem.dto.AttendanceDTO;

/**
 *
 * @author acer
 */
public class AttendanceController {
    private AttendanceBo attendanceBo1;
    private EmployeeBo employeeBo1;

    public AttendanceController() {
     this. attendanceBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.ATTENDANCE);
    this.  employeeBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
    }
     
     public ArrayList<String> getEmployees() throws Exception {
        return employeeBo1.getEmployees();
    }

    public String getSelectedeId(String selectedeId) throws Exception {
        return employeeBo1.getSelectedeId(selectedeId);
      
    }

    public boolean saveAttendance(AttendanceDTO attendance) throws Exception {
       return attendanceBo1.saveAttendance(attendance);
    }

    public boolean updateAttendance(AttendanceDTO aId)throws Exception{
        return attendanceBo1.updateAttendance(aId);
        
    }

    public ArrayList<AttendanceDTO> getAllAttendance() throws Exception {
         return attendanceBo1.getAllAttendance();
    }

    public boolean deleteAttendance(String aId)throws Exception{
         return attendanceBo1.deleteAttendance(aId);
        
    }

    

    

    
}
   
        
    
    

