/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;


import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.SalaryDTO;

/**
 *
 * @author acer
 */
public interface SalaryBo {

    public boolean saveSalary(SalaryDTO salary)throws Exception;

    public boolean deleteSalary(String salId)throws Exception;

    public SalaryDTO searchSalary(String salId)throws Exception;

    public boolean updateSalary(SalaryDTO salary)throws Exception;

    public ArrayList<SalaryDTO> getAllSalary()throws Exception;

    public String searchSalaryID(String string)throws Exception;

    
  
    
}
