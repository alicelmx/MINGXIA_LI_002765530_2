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

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public void deletePatient(Patient selectedPatient) {
        this.patientList.remove(selectedPatient);
    }

    public void clearAll() {
        this.patientList.clear();
    }

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

    public boolean containPatient(Patient patient) {
        return this.patientList.contains(patient);
    }

    public List<Patient> searchByKeyword(String keyword) {
        return this.patientList.stream()
                .filter(
                        s -> String.valueOf(s.getPid()).equalsIgnoreCase(keyword)
                        || s.getFullName().equalsIgnoreCase(keyword)
                        || s.getPhoneNum().equalsIgnoreCase(keyword)
                        || s.getDateOfBirth().equalsIgnoreCase(keyword)
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
