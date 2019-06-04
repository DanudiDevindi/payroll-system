/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.LeavesDAO;
import lk.ijse.payrollSystem.entity.Leaves;

/**
 *
 * @author acer
 */
public class LeavesDAOImpl implements LeavesDAO{

    @Override
    public boolean save(Leaves leaves) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO Leaves VALUES (?,?,?,?,?,?,?,?,?)",leaves.getLevId(),leaves.geteId(),leaves.getEmpname(),leaves.getLevel(),leaves.getType(),leaves.getMonth(),leaves.getTotalLeaves(),leaves.getDateOfLeaves(),leaves.getBalanceLeaves())>0;
    }

    @Override
    public boolean update(Leaves leaves) throws Exception {
          return CrudUtil.executeUpdate("UPDATE Leaves SET EmpId=? Empname=? level=? leaveType=? month=? totalLeaves=? datesOfLeaves=? balanceLeaves=? levId=?  ",leaves.geteId(),leaves.getEmpname(),leaves.getLevel(),leaves.getType(),leaves.getMonth(),leaves.getTotalLeaves(),leaves.getDateOfLeaves(),leaves.getBalanceLeaves())>0; 
    }

    @Override
    public Leaves search(String Empname) throws Exception {
        System.out.println(Empname+"method");
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Leaves WHERE Empname=? ",Empname);
        if (rst.next()){
            System.out.println(rst.getString(1)+rst.getString(2)+rst);
            return new Leaves (rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8),rst.getString(9));
        }
        return null;       
    }

    @Override
    public boolean delete(String levId) throws Exception {
       return CrudUtil.executeUpdate("DELETE From Leaves where levId=?", levId) > 0;
    }

    public boolean updateLeaves(Leaves l) throws Exception{
       return CrudUtil.executeUpdate("UPDATE Leaves SET EId=?, Empname=? ,level=? ,type=?, month=? ,totalLeave=?, datesOfLeaves=?, balanceLeave=?  WHERE levId=? ",l.geteId(),l.getEmpname(),l.getLevel(),l.getType(),l.getMonth(),l.getTotalLeaves(),l.getDateOfLeaves(),l.getBalanceLeaves(),l.getLevId())>0;  
    }

    public ArrayList<Leaves> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Leaves");
        
        ArrayList<Leaves> alLeaves = new ArrayList<>();
        while (rst.next()) {
            alLeaves.add(new Leaves(rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getString(5),
                rst.getString(6),
                rst.getString(7),
                rst.getString(8),
                rst.getString(9)));
                
                    
                   
        }
        return alLeaves;       
    }
    
}
