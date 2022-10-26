/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Patient;
import org.apache.commons.lang3.ObjectUtils;
import tool.JsonFileUitls;
import tool.PatientSerialGenerator;

/**
 *
 * @author limingxia
 */
public class PatientDao {

    static PatientSerialGenerator serialGenerator = PatientSerialGenerator.getInstance();

    public static final String patientInfoJson = "../database/PatientInfo.json";

    /**
     * search userId by username
     *
     * @param uid
     * @return
     */
    public static Patient queryPatientByPid(String uid) {

        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getPid().equalsIgnoreCase(uid)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }

        return resList.get(0);
    }

    public static Patient queryPatientByUName(String userName) {

        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getUsername().equalsIgnoreCase(userName)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }

        return resList.get(0);
    }

    public static List<Patient> queryAllPatientModel() {

        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, Patient.class);
    }

    public static boolean insertNewPatient(Patient patient) {
        patient.setPid(serialGenerator.next());

        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> allEncounters = queryAllPatientModel();

        if (allEncounters.contains(patient)) {
            return false;
        }

        allEncounters.add(patient);
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static void deletePatient(Patient patient) {
        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> allEncounters = queryAllPatientModel();
        allEncounters.remove(patient);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }

    public static List<Patient> queryPatientByCName(String curCommunityName) {

        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(curCommunityName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

}
