/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.AttendanceBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.AttendanceDAO;
import lk.ijse.payrollSystem.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.payrollSystem.dto.AttendanceDTO;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.entity.Attendance;
import lk.ijse.payrollSystem.entity.Employee;

/**
 *
 * @author acer
 */
public class AttendanceBoImpl implements AttendanceBo{
    private AttendanceDAOImpl attendance;
    

    public AttendanceBoImpl() {
        this.attendance=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ATTENDANCE);
    }

    @Override
    public boolean saveAttendance(AttendanceDTO attendanceDTO) throws Exception {
        System.out.println(attendanceDTO.getaId());
        Attendance attendance1 = new Attendance(attendanceDTO.getaId(),attendanceDTO.geteId(),attendanceDTO.getInTime(),attendanceDTO.getOutTime(),attendanceDTO.getDate() );
        return attendance.save(attendance1);
    }

    @Override
    public boolean updateAttendance(AttendanceDTO attendanceDTO) throws Exception {
        Attendance attendance1 = new Attendance(attendanceDTO.getaId(),attendanceDTO.geteId(),attendanceDTO.getInTime(),attendanceDTO.getOutTime(),attendanceDTO.getDate() );
        return attendance.save(attendance1);
        
    }

    @Override
    public ArrayList<AttendanceDTO> getAllAttendance() throws Exception {
         ArrayList<Attendance> allAttendance = attendance.getAll();
        ArrayList<AttendanceDTO> attendanceDTOs = new ArrayList<>();
        for (Attendance attendance : allAttendance) {
           attendanceDTOs.add(new AttendanceDTO(attendance.getaId(),
                    attendance.geteId(), attendance.getInTime(),attendance.getOutTime(),attendance.getDate()));
        }
        return attendanceDTOs;
    }

    @Override
    public boolean deleteAttendance(String aId) throws Exception {
        return attendance.delete(aId);  
    }
    


   

   
   
    
}
