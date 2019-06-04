/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.SalaryDAO;
import lk.ijse.payrollSystem.entity.Loans;
import lk.ijse.payrollSystem.entity.Salary;

/**
 *
 * @author acer
 */
public class SalaryDAOImpl implements SalaryDAO{

    @Override
    public boolean save(Salary salary) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO Salary VALUES (?,?,?,?,?,?,?)",salary.getSalId(),salary.geteId(),salary.getEname(),salary.getLevel(),salary.getSalaryType(),salary.getAmount(),salary.getDate())>0;
    }

    @Override
    public boolean update(Salary salary) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Salary SET EmpId=?, Empname=?, level=?, salaryType=?, salaryAmount=?, Date=? WHERE salId=? ",salary.geteId(),salary.getEname(),salary.getLevel(),salary.getSalaryType(),salary.getAmount(),salary.getDate(),salary.getSalId())>0;      
    }

    @Override
    public Salary search(String ename) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Salary WHERE ename=? ",ename);
        if (rst.next()){
            return new Salary (rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4), rst.getString(5), rst.getBigDecimal(6), rst.getString(7));
        }
        return null;
    }

    @Override
    public boolean delete(String salId) throws Exception {
        System.out.println(salId);
         return CrudUtil.executeUpdate("DELETE From Salary where eid=? or ename=?", salId, salId) > 0;
    }

    public ArrayList<Salary> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Salary");
        
        ArrayList<Salary> alSalary = new ArrayList<>();
        while (rst.next()) {
            alSalary.add(new Salary(rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getString(5),
                rst.getBigDecimal(6),
                rst.getString(7)));
                
                    
                   
        }
        return alSalary;       
    }

    public String searchSalaryId(String string) throws Exception {
         ResultSet rst=CrudUtil.executeQuery("SELECT salId FROM salary WHERE eId=?",string);
         String id=null;
        if (rst.next()) {
            id=rst.getString("salid");
        }
        return id;
//To change body of generated methods, choose Tools | Templates.
    }

    }
    

