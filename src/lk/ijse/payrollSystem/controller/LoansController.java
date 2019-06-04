/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;
import java.util.ArrayList;
import lk.ijse.payrollSystem.business.BoFactory;
import lk.ijse.payrollSystem.business.custom.EmployeeBo;
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.business.custom.LoanCatagoryBo;
import lk.ijse.payrollSystem.business.custom.LoansBo;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.LoanCatagoryDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;
import lk.ijse.payrollSystem.entity.LoanCatagory;

/**
 *
 * @author acer
 */
public class LoansController {
     private LoansBo loansBo1;
    private EmployeeBo employeeBo1;
    private LevelBo levelBo1;
    private LoanCatagoryBo loanCatagoryBo1;

    public LoansController() {
        levelBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
        loansBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LOANS);
        employeeBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
        loanCatagoryBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LOANCATAGORY);
        
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

    public boolean saveLoans(LoansDTO loans)throws Exception {
        System.out.println(loans.getlId());
         return loansBo1.saveLoans(loans);
    }
     public boolean deleteLoans(String lId) throws Exception {
        return loansBo1.deleteLoans(lId);
      }

    public LoansDTO searchLoans(String lId)throws Exception{
        return loansBo1.searchLoans(lId);
        
    }

    public boolean updateLoans(LoansDTO loans) throws Exception {
        return loansBo1.updateLoans(loans);
    }

    public ArrayList<String> getAllLoanIds()throws Exception{
        return loanCatagoryBo1.getAllLoanIds();
    }

    public ArrayList<String> getAllDues()throws Exception{
          return loanCatagoryBo1.getAllDues();
    }

    public ArrayList<LoansDTO> getAllLoans() throws Exception {
        return loansBo1.getAllLoans();
    }

    public EmployeeDTO searchEmployees(String eId) throws Exception {
       return employeeBo1.searchEmployees(eId);
    }

    public LoanCatagoryDTO searchLoanCat(String lcId)throws Exception{
        return loanCatagoryBo1.searchLoanCat(lcId);
    }

    public ArrayList<LoanCatagoryDTO> getAllLoanCategories()throws Exception{
       return  loanCatagoryBo1.getAllLoanCategories();
//To change body of generated methods, choose Tools | Templates.
    }

    public LevelDTO searchLevel(String leId) throws Exception{
        return levelBo1.searchLevel(leId);
    }

    
    
}
