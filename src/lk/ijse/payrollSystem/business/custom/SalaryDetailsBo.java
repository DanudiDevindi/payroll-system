/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import lk.ijse.payrollSystem.dto.SalaryDetailsDTO;

/**
 *
 * @author acer
 */
public interface SalaryDetailsBo {

    public boolean saveSalaryDetails(SalaryDetailsDTO salaryDetailsDTO)throws Exception;

    public boolean deleteSalaryDetails(String sdId)throws Exception ;

    public SalaryDetailsDTO searchSalaryDetails(String sdId)throws Exception;

    public boolean updateSalaryDetails(SalaryDetailsDTO salaryDetails)throws Exception;
    
}
