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
public class Person {

    private String username;
    private String firstName;
    private String lastName;
    private Integer gender;
    private Integer marritialStatus;
    private String phoneNum;
    private String email;
    private String dateOfBirth;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMarritialStatus() {
        return marritialStatus;
    }

    public void setMarritialStatus(Integer marritialStatus) {
        this.marritialStatus = marritialStatus;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        return Objects.equals(dateOfBirth, person.getDateOfBirth())
                && Objects.equals(email, person.getEmail())
                && Objects.equals(firstName, person.getFirstName())
                && Objects.equals(gender, person.getGender())
                && Objects.equals(lastName, person.getLastName())
                && Objects.equals(marritialStatus, person.getMarritialStatus())
                && Objects.equals(phoneNum, person.getPhoneNum())
                && Objects.equals(username, person.getUsername());
    }

}
