
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;

import lk.ijse.payrollSystem.business.BoFactory;
import lk.ijse.payrollSystem.business.custom.LevelBo;
import lk.ijse.payrollSystem.dto.LevelDTO;
import lk.ijse.payrollSystem.view.level;


/**
 *
 * @author acer
 */
public class levelController {
    private LevelBo levelBo;
    
    public levelController(){
        levelBo=BoFactory.getInstance().getBO(BoFactory.BOTypes.LEVEL);
    }
     public boolean saveLevel(LevelDTO levelDTO) throws Exception{
        return levelBo.saveLevel(levelDTO);
    }
      public boolean updateLevel(LevelDTO levelDTO) throws Exception{
        return levelBo.updateLevel(levelDTO);
      } 
      public LevelDTO searchLevel(String leId) throws Exception{
        return levelBo.searchLevel(leId);
    }
      public boolean deleteLevel(String leId) throws Exception {
        return levelBo.deleteLevel(leId);
      }
       public String getSelectedItemCode(String selectedItem)throws Exception{
           return levelBo.getSelectedItemCode(selectedItem);
       }
      
}
