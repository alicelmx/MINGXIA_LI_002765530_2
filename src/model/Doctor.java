/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author limingxia
 */
public class Doctor extends Person {

    private String did;
    private String dName;
    private String department;
    private String level;
    private String hName; // belong to which hospital
    private String hid;
    private String community;
    private String zipCode;
    private List<String> availableTime;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public List<String> getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(List<String> availableTime) {
        this.availableTime = availableTime;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return getdName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Doctor)) {
            return false;
        }

        Doctor doctor = (Doctor) obj;

        return Objects.equals(getDateOfBirth(), doctor.getDateOfBirth())
                && Objects.equals(getEmail(), doctor.getEmail())
                && Objects.equals(getFirstName(), doctor.getFirstName())
                && Objects.equals(getGender(), doctor.getGender())
                && Objects.equals(getLastName(), doctor.getLastName())
                && Objects.equals(getMarritialStatus(), doctor.getMarritialStatus())
                && Objects.equals(getPhoneNum(), doctor.getPhoneNum())
                && Objects.equals(getUsername(), doctor.getUsername())
                && Objects.equals(did, doctor.getDid())
                && Objects.equals(dName, doctor.getdName())
                && Objects.equals(department, doctor.getDepartment())
                && Objects.equals(level, doctor.getLevel())
                && Objects.equals(hName, doctor.gethName())
                && Objects.equals(availableTime, doctor.getAvailableTime())
                && Objects.equals(hid, doctor.getHid())
                && Objects.equals(community, doctor.getCommunity())
                && Objects.equals(zipCode, doctor.getZipCode());
    }

}
