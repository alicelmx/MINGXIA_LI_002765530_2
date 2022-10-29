/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author limingxia
 */
public class DoctorDirectory {

    private List<Doctor> doctorList;

    public DoctorDirectory() {
        this.doctorList = new ArrayList<>();
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
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

    public List<Doctor> searchByKeyword(String keyword) {

        List<Doctor> res = getDoctorList().stream().filter(
                s -> s.getdName().equalsIgnoreCase(keyword)
                || s.getDepartment().equalsIgnoreCase(keyword)
                || s.getPhoneNum().equalsIgnoreCase(keyword)
                || s.getLevel().equals(keyword)
        ).collect(Collectors.toList());

        return res;
    }

}
