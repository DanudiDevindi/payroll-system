/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom;

import lk.ijse.payrollSystem.dao.SuperDAO;
import lk.ijse.payrollSystem.dto.UserDTO;

/**
 *
 * @author acer
 */
public interface UserDAO extends SuperDAO{

    public UserDTO getUserName()throws Exception;

    public UserDTO search(UserDTO dTO)throws Exception;

    public boolean changepsw(String name, String psw, String pswp)throws Exception;

    public UserDTO searches(String usernme, String password)throws Exception;
    
}
