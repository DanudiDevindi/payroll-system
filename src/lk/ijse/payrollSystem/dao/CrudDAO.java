/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao;

import java.util.ArrayList;
import lk.ijse.payrollSystem.entity.SuperEntity;

/**
 *
 * @author acer
 */

    public interface CrudDAO<T extends SuperEntity, ID> extends SuperDAO {
    
    public boolean save(T entity) throws Exception;
     public boolean update(T entity)throws Exception;
     public T search(ID key)throws Exception;
     public boolean delete(ID key)throws Exception;
  
                     
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
    
    
}
