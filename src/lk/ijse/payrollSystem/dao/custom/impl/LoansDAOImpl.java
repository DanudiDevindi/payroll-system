/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.LoansDAO;
import lk.ijse.payrollSystem.entity.Employee;
import lk.ijse.payrollSystem.entity.Loans;

/**
 *
 * @author acer
 */
public class LoansDAOImpl implements LoansDAO{

    @Override
    public boolean save(Loans loans) throws Exception {
        System.out.println(loans.getlId());
        return CrudUtil.executeUpdate("INSERT INTO LOANS VALUES (?,?,?,?,?,?,?,?,?)",loans.getlId(),loans.geteId(),loans.geteName(),loans.getLevel(),loans.getLoanAmount(),loans.getDate(),loans.getDue(),loans.getInterest(),loans.getTotal())>0;
    }

    @Override
    public boolean update(Loans loans) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Loans SET EmpId=?, Empname=?, level=?, TotalLoanAmount=?, date=?, due=?, interest=?, total=? WHERE loanId=? ",loans.geteId(),loans.geteName(),loans.getLevel(),loans.getLoanAmount(),loans.getDate(),loans.getDue(),loans.getInterest(),loans.getTotal(),loans.getlId())>0;   
    }

    @Override
    public Loans search(String eName) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Loans WHERE eName=? ",eName);
        if (rst.next()){
            return new Loans(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getBigDecimal(5),rst.getString(6),rst.getString(7),rst.getDouble(8),rst.getBigDecimal(9));
        }
        return null;
    }

    @Override
    public boolean delete(String lId) throws Exception {
         return CrudUtil.executeUpdate("DELETE From Loans where lId=? or eName=? ", lId, lId) > 0;
    }

    public ArrayList<Loans> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Loans");
        
        ArrayList<Loans> alLoans = new ArrayList<>();
        while (rst.next()) {
            alLoans.add(new Loans(rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getBigDecimal(5),
                rst.getString(6),
                rst.getString(7),
                rst.getDouble(8),
                rst.getBigDecimal(9)));
                
                    
                   
        }
        return alLoans;       
    }

    public Loans getLoanOfEmployee(String eName) throws Exception{
        System.out.println("here");
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM LOANS WHERE eName=?",eName);
        if(rst.next()){
            return new Loans(rst.getString("lID"),rst.getString("eId"),rst.getString("eName"),rst.getString("level"),rst.getBigDecimal("loanAmount"),rst.getString("date"),rst.getString("due"),rst.getDouble("interest"),rst.getBigDecimal("total"));
        
        }else return null;
    }

   
    
}
