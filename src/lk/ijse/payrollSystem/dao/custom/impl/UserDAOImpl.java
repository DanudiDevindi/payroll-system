/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dao.custom.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import lk.ijse.payrollSystem.dao.CrudUtil;
import lk.ijse.payrollSystem.dao.custom.UserDAO;
import lk.ijse.payrollSystem.db.DBConnection;
import lk.ijse.payrollSystem.dto.UserDTO;


public class UserDAOImpl implements UserDAO {

    @Override
    public UserDTO getUserName() throws Exception {
        String sql = "select * from user";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            UserDTO userDTO = new UserDTO(
                    rst.getString("userName"),
                    rst.getString("pw"));

            return userDTO;
        }
        return null;
    }

    @Override
    public UserDTO search(UserDTO dTO) throws Exception {
        String sql = "select * from user where pw='"+dTO.getPw()+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            UserDTO userDTO = new UserDTO(
                    rst.getString("userName"),
                    rst.getString("pw"));

            return userDTO;
        }
        return null;
    }

    @Override
    public boolean changepsw(String name, String psw, String pswp) throws Exception {
        CrudUtil.executeUpdate("DELETE FROM USER WHERE pw=?",pswp);
        return CrudUtil.executeUpdate("INSERT INTO USER VALUES (?,?)",name,psw)> 0;  
    }

    @Override
    public UserDTO searches(String usernme, String password) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM USER WHERE username=? AND pw=?", usernme,password);
        if (rst.next()){
            return new UserDTO(usernme,
                    rst.getString(2)
                    );
        }
        return null;
    }
    
}
