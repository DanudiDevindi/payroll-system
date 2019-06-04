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
import lk.ijse.payrollSystem.business.custom.LoansBo;
import lk.ijse.payrollSystem.business.custom.SalaryBo;
import lk.ijse.payrollSystem.business.custom.SalaryDetailsBo;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LeavesDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;
import lk.ijse.payrollSystem.dto.SalaryDTO;
import lk.ijse.payrollSystem.dto.SalaryDetailsDTO;

/**
 *
 * @author acer
 */
public class paySlipController {
    private SalaryDetailsBo salaryDetailsBo1;
     private EmployeeBo employeeBo1;
    private LevelBo levelBo1;
    private SalaryBo salaryBo1;
    private LoansBo loansBo;
    private LeavesBo leavesBo;

    public paySlipController() {
         this.salaryDetailsBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.SALARYDETAILS);
         this.levelBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
         this.employeeBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
         this.salaryBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.SALARY);
         this.leavesBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEAVES);
         this.loansBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.LOANS);
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

    public boolean saveSalaryDetails(SalaryDetailsDTO salaryDetailsDTO) throws Exception {
         return salaryDetailsBo1.saveSalaryDetails(salaryDetailsDTO);
    }

    public boolean deleteSalaryDetails(String sdId )throws Exception{
        return salaryDetailsBo1.deleteSalaryDetails(sdId);
        
    }

    public SalaryDetailsDTO searchSalaryDetails(String sdId) throws Exception {
         return salaryDetailsBo1.searchSalaryDetails(sdId);
    }

    public boolean updateSalaryDetails(SalaryDetailsDTO salaryDetails)throws Exception{
        return salaryDetailsBo1.updateSalaryDetails(salaryDetails);
    }

    public EmployeeDTO searchEmployees(String eId)throws Exception{
       
        return employeeBo1.searchEmployees(eId);
    }

    public LevelDTO searchlevels(String leId) throws Exception {
        return levelBo1.searchlevels(leId);
    }

    public LoansDTO getLoan(String eId) throws Exception{
       return loansBo.getLoan(eId);
    }

    public SalaryDetailsDTO getSalaryDetail(String eId) throws Exception{
        return salaryDetailsBo1.searchSalaryDetails(eId);
        
    }

    public LeavesDTO searchLeaves(String eId) throws Exception{
        
        return leavesBo.searchLeaves(eId);
    }

    


    
    
    
}
