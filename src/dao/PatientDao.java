/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Community;
import model.Patient;
import org.apache.commons.lang3.ObjectUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;
import tool.serial.PatientSerialGenerator;

/**
 *
 * @author limingxia
 */
public class PatientDao {

    public static final String PATIENT_INFO_JSON = "../database/PatientInfo.json";
    public static File file = new File(PatientDao.class.getResource(PATIENT_INFO_JSON).getFile());

    static PatientSerialGenerator serialGenerator = PatientSerialGenerator.getInstance();

    public static Patient queryPatientByPid(String uid) {
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getPid().equalsIgnoreCase(uid)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }

        return resList.get(0);
    }

    public static boolean insertNewPatient(Patient patient) {
        patient.setPid(serialGenerator.next());

        List<Patient> allEncounters = queryAllPatientModel();

        if (allEncounters.contains(patient)) {
            return false;
        }

        allEncounters.add(patient);

        String json = GsonUtils.listToJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deletePatient(Patient patient) {
        List<Patient> patientList = queryAllPatientModel();
        if (!patientList.remove(patient)) {
            return false;
        }

        String json = GsonUtils.listToJson(patientList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static Patient queryPatientByUName(String userName) {
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getUsername().equalsIgnoreCase(userName)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }

        return resList.get(0);
    }

    public static List<Patient> queryAllPatientModel() {
        return JsonFileUitls.readJsonFileToModel(file, Patient.class);
    }

    public static List<Patient> queryPatientByCName(String curCommunityName) {
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(curCommunityName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

    public static boolean updatePatient(Patient curPatient, Patient newPatient) {
        // pid cannot be changed
        newPatient.setPid(curPatient.getPid());

        List<Patient> patientList = queryAllPatientModel();
        if (!patientList.contains(curPatient)) {
            return false;
        }
        if (patientList.contains(newPatient)) {
            return false;
        }
        patientList.remove(curPatient);
        patientList.add(newPatient);

        String json = GsonUtils.listToJson(patientList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean updatePatientCommunity(String oldCName, String newCName) {
        List<Patient> patientList = queryAllPatientModel();

        for (Patient p : patientList) {
            if (p.getCommunity().equals(oldCName)) {
                Community newC = CommunityDao.queryCommunityListByCName(newCName);
                p.setCity(newC.getCity());
                p.setCommunity(newCName);
            }
        }

        String json = GsonUtils.listToJson(patientList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

}
