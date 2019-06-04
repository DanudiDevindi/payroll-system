/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.AttendanceDAO;
import lk.ijse.payrollSystem.entity.Attendance;
import lk.ijse.payrollSystem.entity.Level;

/**
 *
 * @author acer
 */
public class AttendanceDAOImpl implements AttendanceDAO{

    @Override
    public boolean save(Attendance attendance) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO ATTENDANCE VALUES (?,?,?,?,?)",attendance.getaId(),attendance.geteId(),attendance.getInTime(),attendance.getOutTime(),attendance.getDate())>0;
    }
    

    @Override
    public boolean update(Attendance attendance) throws Exception {
         return CrudUtil.executeUpdate("UPDATE ATTENDANCE SET eId=?, inTime=?, outTime=?, date=? WHERE aId=? ",attendance.geteId(),attendance.getInTime(),attendance.getOutTime(),attendance.getDate(),attendance.getaId())>0;
    }

   public boolean getaId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Attendance> getAll() throws Exception {
         
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Attendance");
        
        ArrayList<Attendance> alAttendances = new ArrayList<>();
        while (rst.next()) {
            alAttendances.add(new Attendance(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                     rst.getString(5)));
        }
        return alAttendances;           
    }
    @ Override
    public boolean delete(String aId)throws Exception{
        return CrudUtil.executeUpdate("DELETE From Attendance where aId=? ", aId) > 0;
    }

    @Override
    public Attendance search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    }
    





   

    
   
   
    
     

 
