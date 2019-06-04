/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.LoansBo;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.LevelDAO;
import lk.ijse.payrollSystem.dao.custom.LoansDAO;
import lk.ijse.payrollSystem.dao.custom.impl.LoansDAOImpl;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;
import lk.ijse.payrollSystem.entity.Level;
import lk.ijse.payrollSystem.entity.Loans;

/**
 *
 * @author acer
 */
public class LoansBoImpl implements LoansBo{
    private LoansDAOImpl loans;

    public LoansBoImpl() {
        loans=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOANS);
    }

    @Override
    public boolean saveLoans(LoansDTO loansDTO) throws Exception {
        System.out.println(loansDTO.getlId());
        Loans loans1 = new Loans(loansDTO.getlId(),loansDTO.geteId(),loansDTO.geteName(),loansDTO.getLevel(),loansDTO.getLoanAmount(),loansDTO.getDate(),loansDTO.getDue(),loansDTO.getInterest(),loansDTO.getTotal());
        return loans.save(loans1);
    }

    @Override
    public boolean deleteLoans(String lId) throws Exception {
       return loans.delete(lId);
    }

    @Override
    public LoansDTO searchLoans(String lId) throws Exception {
          LoansDAO aO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOANS);
          Loans loans = aO.search(lId);
          if(loans!=null)
        return new LoansDTO(loans.getlId(),loans.geteId(),loans.geteName(),loans.getLevel(),loans.getLoanAmount(),loans.getDate(),loans.getDue(),loans.getInterest(),loans.getTotal());
        else
              return null;
    }

    @Override
    public boolean updateLoans(LoansDTO loansDTO) throws Exception {
         Loans loans1 = new Loans(loansDTO.getlId(),loansDTO.geteId(),loansDTO.geteName(),loansDTO.getLevel(),loansDTO.getLoanAmount(),loansDTO.getDate(),loansDTO.getDue(),loansDTO.getInterest(),loansDTO.getTotal());
        return loans.save(loans1);
        
    }

    @Override
    public ArrayList<LoansDTO> getAllLoans() throws Exception {
         ArrayList<Loans> allLoans = loans.getAll();
        ArrayList<LoansDTO> loansDTOs = new ArrayList<>();
        for (Loans loans : allLoans) {
            loansDTOs.add(new LoansDTO(loans.getlId(),
                     loans.geteId(),
                    loans.geteName(),
                    loans.getLevel(),
                    loans.getLoanAmount(),
                    loans.getDate(),
                    loans.getDue(),
                    loans.getInterest(),
                    loans.getTotal()));
            
        }
        return loansDTOs;
        }

    @Override
    public LoansDTO getLoan(String eId) throws Exception {
        Loans l=loans.getLoanOfEmployee(eId);
        if(l!=null){
            return new LoansDTO(l.getlId(),l.geteId(),l.geteName(), l.getLevel(), l.getLoanAmount(), l.getDate(), l.getDue(), l.getInterest(), l.getTotal());
          }else return null;
    }
    }

   


    

   
    
    

