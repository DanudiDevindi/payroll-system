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
import lk.ijse.payrollSystem.business.custom.SalaryBo;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.SalaryDTO;

/**
 *
 * @author acer
 */
public class SalaryController {
    private SalaryBo salaryBo1;
    private EmployeeBo employeeBo1;
    private LevelBo levelBo1;

    public SalaryController() {
        salaryBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.SALARY);
        employeeBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.EMPLOYEE);
        levelBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
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

    public boolean saveSalary(SalaryDTO salary) throws Exception {
         return salaryBo1.saveSalary(salary);
    }
    
    public boolean deleteSalary(String salId)throws Exception{
        return salaryBo1.deleteSalary(salId);
    }

    public SalaryDTO searchSalary(String salId) throws Exception{
        return salaryBo1.searchSalary(salId);
    }

    public boolean updateSalary(SalaryDTO salary) throws Exception {
                return salaryBo1.updateSalary(salary);

    }

    public ArrayList<SalaryDTO> getAllSalary()throws Exception{
       return salaryBo1.getAllSalary();
    }

    public EmployeeDTO searchEmployees(String eId) throws Exception {
         return employeeBo1.searchEmployees(eId);
    }

    public LevelDTO searchlevels(String lName) throws Exception {
         return levelBo1.searchlevels(lName);
    }

    public String searchSalaryId(String string) throws Exception {
       return salaryBo1.searchSalaryID(string) ; //To change body of generated methods, choose Tools | Templates.
    }

   
}
