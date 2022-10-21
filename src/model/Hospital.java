/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author limingxia
 */
public class Hospital {
    
    private String hid;
    private String hName;
    private String city;
    private String community;
    private String zipcode;
    private List<String> doctorDirectory;
    private List<String> patientDirectory;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
    

    public List<String> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(List<String> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public List<String> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(List<String> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
    
}
