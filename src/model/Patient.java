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
public class Patient extends Person {
    
    private String pid;
    private String city;
    private String community; 
    private String zipcode;
    private String house;
    private EncounterHistory encounterHistory;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    public void setCommunity(String cid) {
        this.community = cid;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    @Override
    public String toString() {
        return getPid();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Patient)) {
            return false;
        }

        Patient patient = (Patient) obj;
        
        return Objects.equals(pid, patient.getPid())
                && Objects.equals(city, patient.getCity())
                && Objects.equals(community, patient.getCommunity())
                && Objects.equals(zipcode, patient.getZipcode())
                && Objects.equals(house, patient.getHouse())
                && Objects.equals(encounterHistory, patient.getEncounterHistory());
                
    }

}
