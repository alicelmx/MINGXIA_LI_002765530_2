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
public class Community {

    private String cid;
    private String cName; // name is unique
    private String city;
    private String address;
    private String zipcode;
    private String inhabitants; // num of inhabitants
    private String communityAdminUser;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(String inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getCommunityAdminUser() {
        return communityAdminUser;
    }

    public void setCommunityAdminUser(String communityAdminUser) {
        this.communityAdminUser = communityAdminUser;
    }

    @Override
    public String toString() {
        return getcName();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Community)) {
            return false;
        }

        Community community = (Community) obj;

        return Objects.equals(cid, community.getCid())
                && Objects.equals(cName, community.getcName())
                && Objects.equals(city, community.getCity())
                && Objects.equals(address, community.getAddress())
                && Objects.equals(zipcode, community.getZipcode())
                && Objects.equals(inhabitants, community.getInhabitants())
                && Objects.equals(communityAdminUser, community.getCommunityAdminUser());
    }
}
