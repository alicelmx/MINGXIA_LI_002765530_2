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
public class Appointment {

    private String aid;
    private String pName;
    private String pid;
    private String dName;
    private String did;
    private String datetime;
    private String hid;
    private String hName;
    private String department;
    private Integer status; // 0 未进行 1已结束（已结束的预约看不到）

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return getDatetime();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Appointment)) {
            return false;
        }

        Appointment appointmentModel = (Appointment) obj;

        return Objects.equals(aid, appointmentModel.getAid())
                && Objects.equals(dName, appointmentModel.getdName())
                && Objects.equals(pName, appointmentModel.getpName())
                && Objects.equals(datetime, appointmentModel.getDatetime())
                && Objects.equals(status, appointmentModel.getStatus())
                && Objects.equals(pid, appointmentModel.getPid())
                && Objects.equals(did, appointmentModel.getDid())
                && Objects.equals(hid, appointmentModel.getHid())
                && Objects.equals(hName, appointmentModel.gethName())
                && Objects.equals(department, appointmentModel.getDepartment());
    }

}
