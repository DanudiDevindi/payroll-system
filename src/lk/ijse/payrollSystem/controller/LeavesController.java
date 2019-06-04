/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.BoFactory;
import lk.ijse.payrollSystem.business.custom.EmployeeBo;
import lk.ijse.payrollSystem.business.custom.LeavesBo;
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LeavesDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;

/**
 *
 * @author acer
 */
public class LeavesController {

    private LeavesBo leavesBo1;
      private EmployeeBo employeeBo1;
    private LevelBo levelBo1;

    public LeavesController() {
        leavesBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEAVES);
         levelBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
         employeeBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
    }
    
    public ArrayList<String> getEmployees() throws Exception {
        return employeeBo1.getEmployees();
    }

    public String getSelectedeId(String selectedeId) throws Exception {
        return employeeBo1.getSelectedeId(selectedeId);
      
    }   
    
     public ArrayList<String> getAllLeves() throws Exception {
        return levelBo1.getLevels();
    }

    public String getSelectedItemCode(String selectedItem) throws Exception {
        return levelBo1.getSelectedItemCode(selectedItem);
    
    
    
     }

    public boolean saveLeaves(LeavesDTO leaves) throws Exception {
        return leavesBo1.saveLeaves(leaves);
    }

    public boolean deleteLeaves(String levId) throws Exception{
         return leavesBo1.deleteLeaves(levId);
        
    }

    public LeavesDTO searchLeaves(String levId)throws Exception{
        return leavesBo1.searchLeaves(levId);
        
    }

    public boolean updateLeaves(LeavesDTO leavesDTO) throws Exception {
        return leavesBo1.updateLeaves(leavesDTO);
    }

    public EmployeeDTO searchEmployees(String eId) throws Exception {
           return employeeBo1.searchEmployees(eId);
    }

    public LevelDTO searchlevels(String lName) throws Exception{
        System.out.println("123");
        return levelBo1.searchlevels(lName);
    }

    public ArrayList<LeavesDTO> getAllLeaves() throws Exception {
        return leavesBo1.getAllLeaves();
    }

   
    
   
}
