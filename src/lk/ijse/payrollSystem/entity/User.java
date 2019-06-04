/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.entity;

/**
 *
 * @author acer
 */
public class User {
    private String userName;
    private String pw;

    public User() {
    }

    public User(String userName, String pw) {
        this.userName = userName;
        this.pw = pw;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the pw
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", pw=" + pw + '}';
    }
    
    
}
