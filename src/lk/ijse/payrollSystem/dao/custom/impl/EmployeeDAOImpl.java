/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.EmployeeDAO;
import lk.ijse.payrollSystem.entity.Employee;
import lk.ijse.payrollSystem.entity.Level;

/**
 *
 * @author acer
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    public  ArrayList<Employee> getAll()throws Exception{
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Employee");
        
        ArrayList<Employee> alEmployees = new ArrayList<>();
        while (rst.next()) {
            alEmployees.add(new Employee(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10)));
        }
        return alEmployees;       
        
       
    }

    @Override
    public boolean save(Employee employee) throws Exception {
                                                                                         
          return CrudUtil.executeUpdate("INSERT INTO EMPLOYEE VALUES (?,?,?,?,?,?,?,?,?,?)",employee.geteId(),employee.getName(),employee.getAddress(),employee.getGender(),employee.getDob(),employee.getTelNo(),employee.getDateOfJoining(),employee.getNic(),employee.geteMail(),employee.getLeId())>0;
    }

    @Override
    public boolean update(Employee employee) throws Exception {
        return CrudUtil.executeUpdate("UPDATE EMPLOYEE SET name=?, address=?, gender=?, dob=?, TelNo=?, dateOfJoining=?, Nic=?, email=?, leId=? WHERE eId=? ",employee.getName(),employee.getAddress(),employee.getGender(),employee.getDob(),employee.getTelNo(),employee.getDateOfJoining(),employee.getNic(),employee.geteMail(),employee.getLeId(),employee.geteId())>0;
    }    
    

    @Override
    public Employee search(String eName) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Employee WHERE name=? ",eName);
        if (rst.next()){
            return new Employee(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10));
        }   
        return null;
    }

    @Override
    public boolean delete(String eId) throws Exception {
        return CrudUtil.executeUpdate("DELETE From Employee where eId=?", eId) > 0;
        
    }
    
     @Override
    public String getSelectedeId(String selectedeId) throws Exception {
        String sql="SELECT eId FROM EMPLOYEE ";
        ResultSet rst = CrudUtil.executeQuery(sql, selectedeId);
        rst.next();
        return rst.getString(1);
    }

    public ArrayList<String> getEmployees() throws Exception {
      
        String sql="SELECT name FROM Employee";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<String>employees=new ArrayList<>();
        while(rst.next()){
            employees.add(rst.getString(1));
        }
        
        return employees;
        
    }

    public Employee searchemp(String eId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Employee WHERE name=? ", eId);
        if (rst.next()){
            return new Employee(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10));
        }
        return null;
    }
    public Employee searchemps(String eId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Employee WHERE eid=? or name=?", eId, eId);
        if (rst.next()){
            return new Employee(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10));
        }
        return null;
    }

  

   

   

    
  
    
}
