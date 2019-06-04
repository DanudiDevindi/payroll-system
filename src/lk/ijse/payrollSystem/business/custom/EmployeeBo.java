/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;

/**
 *
 * @author acer
 */
public interface EmployeeBo {
     public boolean saveEmployee(EmployeeDTO employee)throws Exception;
     
      public boolean deleteEmployee(String eId)throws Exception;
      
      public boolean updateEmployee(EmployeeDTO employee) throws Exception;
      
     public EmployeeDTO searchEmployee(String eId) throws Exception;
     
     public String getSelectedeId(String selectedeId)throws Exception;
     
     public ArrayList<String> getEmployees()throws Exception;

    public ArrayList<EmployeeDTO> getAllEmployees()throws Exception;

    public EmployeeDTO searchEmployees(String eId)throws Exception;

   

    

     

    
}
