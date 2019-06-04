/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.AttendanceDTO;
import lk.ijse.payrollSystem.dto.EmployeeDTO;

/**
 *
 * @author acer
 */
public interface AttendanceBo {

    public boolean saveAttendance(AttendanceDTO attendance)throws Exception;

    public boolean updateAttendance(AttendanceDTO aId)throws Exception;

    public ArrayList<AttendanceDTO> getAllAttendance()throws Exception;

    public boolean deleteAttendance(String aId)throws Exception;
     

    
}
