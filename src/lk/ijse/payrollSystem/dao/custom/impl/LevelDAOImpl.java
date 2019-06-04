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
import lk.ijse.payrollSystem.dao.custom.LevelDAO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.entity.Level;

/**
 *
 * @author acer
 */
public class LevelDAOImpl implements LevelDAO {
    
    @Override
    public boolean save(Level level) throws Exception {
    return CrudUtil.executeUpdate("CALL addLevel(?,?,?,?,?)",level.getLeId(), level.getlName(), level.getBasicSalary(),level.getEPFAmount(),level.getTotalLeaves())>0;
                                              
    }   

    @Override
    public boolean update(Level level) throws Exception {
        
       return CrudUtil.executeUpdate("call updateLevel('"+level.getLeId()+"','"+level.getlName()+"','"+level.getBasicSalary()+"','"+level.getEPFAmount()+"','"+level.getTotalLeaves()+"')")>0;        
    }
    

    public boolean delete(String leId) throws Exception {
        return CrudUtil.executeUpdate("call deletelevel('"+leId+"')") > 0;
    }

    public ArrayList<Level> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("call selectLevel()");
        ArrayList<Level>al=new ArrayList<>();
        while (rst.next()) {
            al.add(new Level(rst.getString(1)));
        }
        return al;
    }

    @Override
    public Level search(String leId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Level WHERE leId=? or lName=?",leId, leId);
        if (rst.next()){
            return new Level(rst.getString(1), rst.getString(2), rst.getBigDecimal(3),rst.getBigDecimal(4),rst.getString(5));
        }
        return null;
    }

    @Override
    public ArrayList<String> getLevels() throws Exception {
    
        String sql="SELECT lname FROM Level";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<String>levels=new ArrayList<>();
        while(rst.next()){
            levels.add(rst.getString(1));
        }
       
        return levels;
    }

    @Override
    public String getSelectedItemCode(String selectedItem) throws Exception {
        String sql="SELECT leID FROM lEVEL WHERE lname=? ";
        ResultSet rst = CrudUtil.executeQuery(sql, selectedItem);
        rst.next();
        return rst.getString(1);
    }

    public Level searchId(String lName) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Level WHERE lName=? or leId=?",lName, lName);
        if (rst.next()){
            return new Level(rst.getString(1),lName , rst.getBigDecimal(3),rst.getBigDecimal(4),rst.getString(5));
        }
        return null;
    }

   

   

    

   
    }

   

   

   

    


    
    
    
    
