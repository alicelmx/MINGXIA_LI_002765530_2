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
public class Encounter {

    private String eid;
    private String datetime;
    private String pName;
    private String pid;
    private String dName;
    private String did;
    private String hid;
    private String hName;
    private String deptment;
    private VitalSign vitalSign;
    private String prescription;
    private String remark;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
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

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Override
    public String toString() {
        return getDatetime();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Encounter)) {
            return false;
        }

        Encounter encounter = (Encounter) obj;

        return Objects.equals(eid, encounter.getEid())
                && Objects.equals(datetime, encounter.getDatetime())
                && Objects.equals(pName, encounter.getpName())
                && Objects.equals(dName, encounter.getdName())
                && Objects.equals(hName, encounter.gethName())
                && Objects.equals(deptment, encounter.getDeptment())
                && Objects.equals(vitalSign, encounter.getVitalSign())
                && Objects.equals(prescription, encounter.getPrescription())
                && Objects.equals(remark, encounter.getRemark())
                && Objects.equals(pid, encounter.getPid())
                && Objects.equals(did, encounter.getDid())
                && Objects.equals(hid, encounter.getHid());
    }

}
