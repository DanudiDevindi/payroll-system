/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom;

import java.util.ArrayList;
import lk.ijse.payrollSystem.dto.LevelDTO;

/**
 *
 * @author acer
 */
public interface LevelBo {
    public boolean saveLevel(LevelDTO level)throws Exception;
    
    public boolean deleteLevel(String leId)throws Exception;
    
    public boolean updateLevel(LevelDTO level) throws Exception;
    
    public LevelDTO searchLevel(String levId) throws Exception;
    
    public ArrayList<String> getLevels()throws Exception;
  
    public String getSelectedItemCode(String selectedItem)throws Exception;

    public LevelDTO searchlevels(String lName)throws Exception;
    
    
}
