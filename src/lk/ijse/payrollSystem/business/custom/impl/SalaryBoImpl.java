/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.dao.custom.QueryDAO;
import lk.ijse.payrollSystem.dao.custom.impl.LevelDAOImpl;
import lk.ijse.payrollSystem.entity.Level;
import lk.ijse.payrollSystem.business.custom.SalaryBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.LevelDAO;
import lk.ijse.payrollSystem.dao.custom.SalaryDAO;
import lk.ijse.payrollSystem.dao.custom.impl.LoansDAOImpl;
import lk.ijse.payrollSystem.dao.custom.impl.SalaryDAOImpl;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.SalaryDTO;
import lk.ijse.payrollSystem.entity.Loans;
import lk.ijse.payrollSystem.entity.Salary;

/**
 *
 * @author acer
 * 
 * 
 */

      
public class SalaryBoImpl implements SalaryBo{
     private SalaryDAOImpl salary;

    public SalaryBoImpl() {
        salary=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SALARY);

    }
    @Override
    public boolean saveSalary(SalaryDTO salaryDTO) throws Exception {
      Salary salary1=new Salary(salaryDTO.getSalId(),salaryDTO.geteId(),salaryDTO.getEname(),salaryDTO.getLevel(),salaryDTO.getSalaryType(),salaryDTO.getAmount(),salaryDTO.getDate());     
        return salary.save(salary1);
       
    }

    @Override
    public boolean deleteSalary(String salId) throws Exception {
         return salary.delete(salId);
    }

    @Override
    public SalaryDTO searchSalary(String salId) throws Exception {
       SalaryDAO aO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SALARY);
          Salary salary = aO.search(salId);
          if(salary!=null)
        return new SalaryDTO(salary.getSalId(),salary.geteId(),salary.getEname(),salary.getLevel(),salary.getSalaryType(),salary.getAmount(),salary.getDate());
        else
              return null;
    }

    @Override
    public boolean updateSalary(SalaryDTO salaryDTO) throws Exception {
          Salary salary1=new Salary(salaryDTO.getSalId(),salaryDTO.geteId(),salaryDTO.getEname(),salaryDTO.getLevel(),salaryDTO.getSalaryType(),salaryDTO.getAmount(),salaryDTO.getDate());     
        return salary.save(salary1);
        
    }

    @Override
    public ArrayList<SalaryDTO> getAllSalary() throws Exception {
        ArrayList<Salary> allSalary = salary.getAll();
        ArrayList<SalaryDTO> salaryDTOs = new ArrayList<>();
        for (Salary salary : allSalary) {
            salaryDTOs.add(new SalaryDTO(salary.getSalId(),
                     salary.geteId(),
                    salary.getEname(),
                    salary.getLevel(),
                    salary.getSalaryType(),
                    salary.getAmount(),
                    salary.getDate()));
            
        }
        return salaryDTOs;
        }

    @Override
    public String searchSalaryID(String string) throws Exception {
        return salary.searchSalaryId(string); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
  


    
    

