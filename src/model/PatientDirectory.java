/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author limingxia
 */
public class PatientDirectory {

    private List<Patient> patientList;

    public PatientDirectory(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public void deletePatient(Patient selectedPatient) {
        this.patientList.remove(selectedPatient);
    }

    // TODO 筛选关键字有待确定
    public List<Patient> searchByKeyword(String keyword) {
        return this.patientList.stream()
                .filter(
                        s -> String.valueOf(s.getPid()).equalsIgnoreCase(keyword)
                        || (s.getFirstName() + " " + s.getLastName()).equalsIgnoreCase(keyword)
                        || s.getPhoneNum().equalsIgnoreCase(keyword)
                        || s.getEmail().equalsIgnoreCase(keyword)
                        || s.getCity().equalsIgnoreCase(keyword)
                        || s.getCommunity().equalsIgnoreCase(keyword)
                ).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof PatientDirectory)) {
            return false;
        }

        PatientDirectory patientDirectory = (PatientDirectory) obj;

        return Objects.equals(patientList, patientDirectory.getPatientList());
               
    }

}
