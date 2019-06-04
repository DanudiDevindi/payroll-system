/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudDAO;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.entity.Employee;

/**
 *
 * @author acer
 */
public interface EmployeeDAO extends CrudDAO<Employee, String>{


   

     public String getSelectedeId(String selectedeId)throws Exception;
     
     public ArrayList<String> getEmployees()throws Exception;
     
     
      

    
    
    
}
