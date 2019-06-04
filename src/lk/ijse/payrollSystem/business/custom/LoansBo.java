/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.EmployeeDTO;
import lk.ijse.payrollSystem.dto.LoansDTO;

/**
 *
 * @author acer
 */
public interface LoansBo {

    public boolean saveLoans(LoansDTO loans)throws Exception;
    
    public boolean deleteLoans(String lId)throws Exception;

    public LoansDTO searchLoans(String lId)throws Exception;

    public boolean updateLoans(LoansDTO loans)throws Exception;
    
    
    public ArrayList<LoansDTO> getAllLoans()throws Exception;

    public LoansDTO getLoan(String eId)throws Exception;
      
    
     

    
}
