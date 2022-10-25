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
public class AppointmentModel {
    
    private String aid;
    private String pName;
    private String dName;
    private String datetime;
    private int status; // 0 未进行 1已结束（已结束的预约看不到）

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.aid;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof AppointmentModel)) {
            return false;
        }

        AppointmentModel appointmentModel = (AppointmentModel) obj;

        return Objects.equals(aid, appointmentModel.getAid())
                && Objects.equals(dName, appointmentModel.getdName())
                && Objects.equals(pName, appointmentModel.getpName())
                && Objects.equals(datetime, appointmentModel.getDatetime())
                && Objects.equals(status, appointmentModel.getStatus());
    }

    
}
