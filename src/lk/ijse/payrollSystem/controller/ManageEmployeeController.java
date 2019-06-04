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
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;



/**
 *
 * @author acer
 */
public class ManageEmployeeController {
    private LevelBo levelBo;
    private EmployeeBo employeeBo;
    private AttendanceBo attendanceBo;

    public ManageEmployeeController() {
    this.  levelBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
    this. employeeBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
    this. attendanceBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.ATTENDANCE);
    }
   
    public ArrayList<String> getAllLeves() throws Exception {
        return levelBo.getLevels();
    }

    public String getSelectedItemCode(String selectedItem) throws Exception {
        return levelBo.getSelectedItemCode(selectedItem);
        
    }

    public boolean saveEmployee(EmployeeDTO employeeDTO) throws Exception {
       return employeeBo.saveEmployee(employeeDTO);
        
        
    }
  public boolean deleteEmployee(String eId)throws Exception{
      return employeeBo.deleteEmployee(eId);
  } 
  
  public boolean updateEmployee(EmployeeDTO eId) throws Exception{
        return employeeBo.updateEmployee(eId);
    
  }
   public EmployeeDTO searchEmployee(String eId) throws Exception{
        return employeeBo.searchEmployee(eId);
  }
   
   public String getSelectedeId(String selectedeId) throws Exception {
        return employeeBo.getSelectedeId(selectedeId);
        
    }

    public ArrayList<EmployeeDTO> getAllEmployees()throws Exception{
        return employeeBo.getAllEmployees();
    }
   
   
}
    

 

