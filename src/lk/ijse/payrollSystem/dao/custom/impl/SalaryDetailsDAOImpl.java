/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.sql.ResultSet;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.SalaryDetailsDAO;
import lk.ijse.payrollSystem.entity.SalaryDetails;

/**
 *
 * @author acer
 */
public class SalaryDetailsDAOImpl implements SalaryDetailsDAO{

    @Override
    public boolean save(SalaryDetails salaryDetails) throws Exception {
        return 0<=CrudUtil.executeUpdate("INSERT INTO SalaryDetails VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) ",salaryDetails.getSdId(),salaryDetails.getEmpId(),salaryDetails.getEmpname(),salaryDetails.getLevel(),salaryDetails.getBasicSalaryAmount(),salaryDetails.getSalId(),salaryDetails.getDate(),salaryDetails.getNoPay(),salaryDetails.getLoan(),salaryDetails.getDamages(),salaryDetails.getEpf(),salaryDetails.getGrossDeduction(),salaryDetails.getNetSalary());
    }

    @Override
    public boolean update(SalaryDetails salaryDetails) throws Exception {
         return CrudUtil.executeUpdate("UPDATE SalaryDetails SET EmpId=?, Empname=?, level=?, basicSalaryAmount=?, salId=?, sdId=?, date=?, NoPay=?, loan=?, damages=?, EPF=?, grossDeduction=?, netSalary=? WHERE salId=? ",salaryDetails.getEmpId(),salaryDetails.getEmpname(),salaryDetails.getLevel(),salaryDetails.getBasicSalaryAmount(),salaryDetails.getSalId(),salaryDetails.getDate(),salaryDetails.getNoPay(),salaryDetails.getLoan(),salaryDetails.getDamages(),salaryDetails.getEpf(),salaryDetails.getGrossDeduction(),salaryDetails.getNetSalary(),salaryDetails.getSdId())>0;      
        
    }

    @Override
    public SalaryDetails search(String empName) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM SalaryDetails WHERE empName=? ",empName);
        if (rst.next()){
            return new SalaryDetails (rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getBigDecimal(5), rst.getString(6), rst.getString(7),rst.getBigDecimal(8),rst.getBigDecimal(9),rst.getBigDecimal(10),rst.getBigDecimal(11),rst.getBigDecimal(12),rst.getBigDecimal(13));
        }
        return null;
    }

    @Override
    public boolean delete(String sdId) throws Exception {
         return CrudUtil.executeUpdate("DELETE From SalaryDetails where sdId=? ", sdId) > 0;
    }
    
}
