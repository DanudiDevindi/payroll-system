/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.business.custom.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.dao.custom.LevelDAO;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.entity.Level;
import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.impl.LevelDAOImpl;
//import lk.ijse.payrollSystem.view.level;

/**
 *
 * @author acer
 */
public class LevelBoImpl implements LevelBo{
      private LevelDAOImpl level;

    public LevelBoImpl() {
        level=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LEVEL);
    }
    

    @Override
    public boolean deleteLevel(String leId) throws Exception{
        return level.delete(leId);
    }

    @Override
    public boolean updateLevel(LevelDTO levelDTO) throws Exception {
       
       Level level1 = new Level(levelDTO.getLeId(),levelDTO.getlName(), levelDTO.getBasicSalary(),levelDTO.getEPFAmount(),levelDTO.getTotalLeaves());
        return level.update(level1); 
    }
    @Override
    public boolean saveLevel(LevelDTO levelDTO) throws Exception {
        System.out.println(levelDTO.getLeId());
        Level level1 = new Level(levelDTO.getLeId(),levelDTO.getlName(), levelDTO.getBasicSalary(),levelDTO.getEPFAmount(),levelDTO.getTotalLeaves());
        return level.save(level1);
    
    }

    @Override
    public LevelDTO searchLevel(String leId) throws Exception {
        LevelDAO aO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LEVEL);
        Level level = aO.search(leId);
        if (level != null) {
            return new LevelDTO(level.getLeId(), level.getlName(), level.getBasicSalary(), level.getEPFAmount(), level.getTotalLeaves());
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<String> getLevels() throws Exception {
          return level.getLevels();
    }

    @Override
    public String getSelectedItemCode(String selectedItem) throws Exception {
        return level.getSelectedItemCode(selectedItem);
    }

    @Override
    public LevelDTO searchlevels(String leId) throws Exception {
      
        Level level1 = level.searchId(leId);
        
        if(level1!=null){
            return new LevelDTO(level1.getLeId(), level1.getlName(), level1.getBasicSalary(),level1.getEPFAmount(),level1.getTotalLeaves());
        }else
            return null;
       
    }

    
    
   
    
  
}
