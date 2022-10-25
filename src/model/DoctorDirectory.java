/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author limingxia
 */
public class DoctorDirectory {

    private List<Doctor> doctorList = new ArrayList<>();

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof DoctorDirectory)) {
            return false;
        }

        DoctorDirectory doctorDirectory = (DoctorDirectory) obj;

        return Objects.equals(doctorList, doctorDirectory.getDoctorList());
    }

}
