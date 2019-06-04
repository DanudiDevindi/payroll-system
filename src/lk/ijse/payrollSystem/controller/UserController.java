/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.controller;

import lk.ijse.payrollSystem.dao.DAOFactory;
import lk.ijse.payrollSystem.dao.custom.UserDAO;
import lk.ijse.payrollSystem.dto.UserDTO;

/**
 *
 * @author acer
 */
public class UserController {
    private static UserDAO dAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    
    public static UserDTO getAll() throws Exception {
        
        return dAO.getUserName();
    }
    
    public static UserDTO search(UserDTO dTO) throws Exception {
        
        return dAO.search(dTO);
    }

    public static boolean changepw(String name, String psw, String pswp)throws Exception {
        return dAO.changepsw(name,psw,pswp);
    }

    public static UserDTO searche(String usernme, String password) throws Exception {
        return dAO.searches(usernme,password);
    }
}
