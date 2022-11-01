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
public class Hospital {

    private String hid;
    private String hName;
    private String phone;
    private String city;
    private String community;
    private String zipCode;
    private String intro;
    private String hospitalAdminUserName;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHospitalAdminUserName() {
        return hospitalAdminUserName;
    }

    public void setHospitalAdminUserName(String hospitalAdminUserName) {
        this.hospitalAdminUserName = hospitalAdminUserName;
    }

    @Override
    public String toString() {
        return gethName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Hospital)) {
            return false;
        }

        Hospital hospital = (Hospital) obj;

        return Objects.equals(hid, hospital.getHid())
                && Objects.equals(hName, hospital.gethName())
                && Objects.equals(phone, hospital.getPhone())
                && Objects.equals(city, hospital.getCity())
                && Objects.equals(community, hospital.getCommunity())
                && Objects.equals(zipCode, hospital.getZipCode())
                && Objects.equals(hospitalAdminUserName, hospital.getHospitalAdminUserName())
                && Objects.equals(intro, hospital.getIntro());
    }

}
