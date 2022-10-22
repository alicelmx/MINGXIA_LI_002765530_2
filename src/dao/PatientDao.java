/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import model.LoginModel;
import model.Patient;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class PatientDao {
    
    public static final String patientInfoJson = "../database/PatientInfo.json";
    
    /**
     * search userId by username
     * @param uid
     * @return 
     */
    public Patient findPatientInfoByUid(String uid) {
        
        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        List<Patient> patientModelList = JsonFileUitls.readJsonFileToModel(file, Patient.class);
        List<Patient> resList = patientModelList.stream().filter(s->s.getPid().equalsIgnoreCase(uid)).collect(Collectors.toList());

        return resList.get(0);
    }
    
}
