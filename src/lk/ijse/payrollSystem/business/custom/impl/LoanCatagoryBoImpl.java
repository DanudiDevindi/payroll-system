/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.LoanCatagoryBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.LoanCatagoryDAO;
import lk.ijse.payrollSystem.dao.custom.impl.LoanCatagoryDAOImpl;
import lk.ijse.payrollSystem.dto.LoanCatagoryDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;
import lk.ijse.payrollSystem.entity.LoanCatagory;

/**
 *
 * @author acer
 */
public class LoanCatagoryBoImpl implements LoanCatagoryBo{
     private LoanCatagoryDAOImpl loanCatagory;

    public LoanCatagoryBoImpl() {
        loanCatagory=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOANCATAGORY);
    }
     
     

    @Override
    public boolean saveLoancatagory(LoanCatagoryDTO loanCatagoryDTO) throws Exception {
          System.out.println(loanCatagoryDTO.getLcId());
       LoanCatagory loanCatagory1 = new LoanCatagory(loanCatagoryDTO.getLcId(),loanCatagoryDTO.getLoanType(),loanCatagoryDTO.getLoanAmount(),loanCatagoryDTO.getDue(),loanCatagoryDTO.getInterest());
        return loanCatagory.save(loanCatagory1);
    }

    @Override
    public boolean updateLoancatagory(LoanCatagoryDTO loanCatagoryDTO) throws Exception {
       LoanCatagory loanCatagory1 = new LoanCatagory(loanCatagoryDTO.getLcId(),loanCatagoryDTO.getLoanType(),loanCatagoryDTO.getLoanAmount(),loanCatagoryDTO.getDue(),loanCatagoryDTO.getInterest());
        return loanCatagory.updateLoancatagory(loanCatagory1);
    }

    @Override
    public LoanCatagoryDTO searchLoanCatagory(String lcId) throws Exception {
        LoanCatagoryDAO aO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOANCATAGORY);
          LoanCatagory loanCatagory = aO.search(lcId);
         return new LoanCatagoryDTO(loanCatagory.getLcId(),loanCatagory.getLoanType(),loanCatagory.getLoanAmount(),loanCatagory.getDue(),loanCatagory.getInterest());
        
    }

    @Override
    public boolean deleteLoanCatagory(String lcId) throws Exception {
        return loanCatagory.delete(lcId);
    }

    @Override
    public ArrayList<String> getAllLoanIds() throws Exception {
        return loanCatagory.getAllLoanIds();
    }

    @Override
    public ArrayList<String> getAllDues() throws Exception {
          return loanCatagory.getAllDues();
    }

    @Override
    public LoanCatagoryDTO searchLoanCat(String lcId) throws Exception {
         LoanCatagory loanCatagory1 = loanCatagory.search(lcId);
        return new LoanCatagoryDTO(loanCatagory1.getLcId(),loanCatagory1.getLoanType(),loanCatagory1.getLoanAmount(),loanCatagory1.getDue(),loanCatagory1.getInterest());
    
    }

    @Override
    public ArrayList<LoanCatagoryDTO> getAllLoanCategories() throws Exception {
        ArrayList<LoanCatagory> loans=loanCatagory.getAllLoanCategories();
        ArrayList<LoanCatagoryDTO> ldto=new ArrayList<>();
        for (LoanCatagory l : loans) {
            ldto.add(new LoanCatagoryDTO(l.getLcId(),l.getLoanType(),l.getLoanAmount(),l.getDue(),l.getInterest()));
            }
        return ldto;    }

    
    
}
