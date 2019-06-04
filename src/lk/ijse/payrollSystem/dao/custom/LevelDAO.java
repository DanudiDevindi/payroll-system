/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dao.CrudDAO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.entity.Level;

/**
 *
 * @author acer
 */
public interface LevelDAO extends CrudDAO<Level, String> {
   
   
    
    public ArrayList<String> getLevels()throws Exception;
  
    public String getSelectedItemCode(String selectedItem)throws Exception;
    
}
