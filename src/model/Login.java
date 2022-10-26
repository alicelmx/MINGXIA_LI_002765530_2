/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author limingxia
 */
public class Login {
    
    private Integer roleType; 
    private String userName; // unique
    private String password;

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Login)) {
            return false;
        }

        Login loginModel = (Login) obj;

        return Objects.equals(roleType, loginModel.getRoleType())
                && Objects.equals(userName, loginModel.getUserName())
                && Objects.equals(password, loginModel.getPassword());
                
    }

    
}
