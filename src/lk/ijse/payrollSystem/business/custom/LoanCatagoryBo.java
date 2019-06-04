/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.LoanCatagoryDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;
import lk.ijse.payrollSystem.entity.LoanCatagory;

/**
 *
 * @author acer
 */
public interface LoanCatagoryBo {

    public boolean saveLoancatagory(LoanCatagoryDTO loanCatagory)throws Exception;

    public boolean updateLoancatagory(LoanCatagoryDTO loanCatagory)throws Exception;

    public LoanCatagoryDTO searchLoanCatagory(String lcId)throws Exception;

    public boolean deleteLoanCatagory(String lcId)throws Exception;

    public ArrayList<String> getAllLoanIds()throws Exception;

    public ArrayList<String> getAllDues()throws Exception;

    public LoanCatagoryDTO searchLoanCat(String lcId)throws Exception;

    public ArrayList<LoanCatagoryDTO> getAllLoanCategories()throws Exception;

    

   
    
}
