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
import lk.ijse.payrollSystem.dao.custom.LoanCatagoryDAO;
import lk.ijse.payrollSystem.entity.Level;
import lk.ijse.payrollSystem.entity.LoanCatagory;

/**
 *
 * @author acer
 */
public class LoanCatagoryDAOImpl implements LoanCatagoryDAO{

    @Override
    public boolean save(LoanCatagory loanCatagory) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO LOANCATAGORY VALUES (?,?,?,?,?)", loanCatagory.getLcId(),loanCatagory.getLoanType(),loanCatagory.getLoanAmount(),loanCatagory.getDue(),loanCatagory.getInterest())>0;
//    return CrudUtil.executeUpdate(" UPDATE  LOANCATAGORY SET loanType =?,loanAmount=?,due=?,interest=? WHERE lcId=?",k.getLoanType(),k.getLoanAmount(),k.getDue(),k.getInterest(),k.getLcId())>0;
    }

    @Override
    public boolean update(LoanCatagory loanCatagory) throws Exception {
        System.out.println(loanCatagory.getLcId());
        return CrudUtil.executeUpdate("UPDATE LOANCATAGORY SET loanType=?, loanAmount=?, due=?, interest=? WHERE loanId=? ",loanCatagory.getLoanType(),loanCatagory.getLoanAmount(),loanCatagory.getDue(),loanCatagory.getInterest(),loanCatagory.getLcId())>0;        
    }

    @Override
    public LoanCatagory search(String lcId) throws Exception {
       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM LoanCatagory WHERE lcId=? ",lcId);
        if (rst.next()){
            return new LoanCatagory(rst.getString(1), rst.getString(2), rst.getBigDecimal(3),rst.getString(4),rst.getDouble(5));
        }
        return null;
    }

    @Override
    public boolean delete(String lcId) throws Exception {
       return CrudUtil.executeUpdate("DELETE From Loancatagory where lcId=? ", lcId) > 0;
    }

    public ArrayList<String> getAllLoanIds() throws Exception {
         String sql="SELECT lcId FROM LoanCatagory";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<String>LoanId=new ArrayList<>();
        while(rst.next()){
            LoanId.add(rst.getString(1));
        }
        
        return LoanId;
    }

    public ArrayList<String> getAllDues() throws Exception {
        String sql="SELECT due FROM LoanCatagory";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<String>due=new ArrayList<>();
        while(rst.next()){
            due.add(rst.getString(1));
        }
        
        return due;
    }

    public boolean updateLoancatagory(LoanCatagory k) throws Exception{
    return CrudUtil.executeUpdate(" UPDATE  LOANCATAGORY SET loanType =?,loanAmount=?,due=?,interest=? WHERE lcId=?",k.getLoanType(),k.getLoanAmount(),k.getDue(),k.getInterest(),k.getLcId())>0;
    }

    public ArrayList<LoanCatagory> getAllLoanCategories() throws Exception {
           ResultSet rst=CrudUtil.executeQuery("select * from loancatagory");
           ArrayList<LoanCatagory> loans=new ArrayList<>();
           while (rst.next()) {            
            loans.add(new LoanCatagory(rst.getString(1), rst.getString(2),rst.getBigDecimal(3), rst.getString(4),rst.getDouble(5)));
        }
           return loans;
    }
    
}
