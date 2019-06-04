/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;

import lk.ijse.payrollSystem.business.BoFactory;
import lk.ijse.payrollSystem.business.custom.LoanCatagoryBo;
import lk.ijse.payrollSystem.dto.LoanCatagoryDTO;

/**
 *
 * @author acer
 */
public class LoanCatagoryController {
    private LoanCatagoryBo loanCatagoryBo1;

    public LoanCatagoryController() {
        loanCatagoryBo1=BoFactory.getInstance().getBO(BoFactory.BOTypes.LOANCATAGORY);
    }

    public boolean saveLoanCatagory(LoanCatagoryDTO loanCatagory) throws Exception {
        return loanCatagoryBo1.saveLoancatagory(loanCatagory);
    }

    public boolean updateLoanCatagory(LoanCatagoryDTO loanCatagory) throws Exception {
        return loanCatagoryBo1.updateLoancatagory(loanCatagory);
    }

    public LoanCatagoryDTO searchLoanCatagory(String lcId) throws Exception {
              return loanCatagoryBo1.searchLoanCatagory(lcId);

    }

    public boolean deleteLoanCatagory(String lcId) throws Exception {
       return loanCatagoryBo1.deleteLoanCatagory(lcId);
    }

   
    
    
}
