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
public class HospitalDirectory {

    private List<Hospital> hospitalList;

    public HospitalDirectory() {
        this.hospitalList = new ArrayList<>();
    }

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public void addHospital(Hospital hospital) {
        hospitalList.add(hospital);
    }

    public void removeHospital(Hospital doctor) {
        hospitalList.remove(doctor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof HospitalDirectory)) {
            return false;
        }

        HospitalDirectory hospitalDirectory = (HospitalDirectory) obj;

        return Objects.equals(hospitalList, hospitalDirectory.getHospitalList());
    }

    public List<Hospital> searchByKeyword(String keyword) {

        List<Hospital> res = getHospitalList().stream().filter(
                s -> s.gethName().equalsIgnoreCase(keyword)
                || s.getCity().equalsIgnoreCase(keyword)
                || s.getIntro().contains(keyword)
        ).collect(Collectors.toList());

        return res;
    }

}
