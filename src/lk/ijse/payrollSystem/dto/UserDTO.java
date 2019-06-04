/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.dto;

/**
 *
 * @author acer
 */
public class UserDTO {
    private String userName;
    private String pw;

    public UserDTO() {
    }

    public UserDTO(String userName, String pw) {
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
        return "UserDTO{" + "userName=" + userName + ", pw=" + pw + '}';
    }
    
    
}
