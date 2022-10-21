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
        List<Patient> patientModelList = null;
        
        File file = new File(PatientDao.class.getResource(patientInfoJson).getFile());
        try {
            String json = FileUtils.readFileToString(file,"utf-8");
            // TODO 这里序列化可能有问题
            patientModelList = GsonUtils.parseJsonArrayWithGson(json, Patient.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Patient> resList = patientModelList.stream().filter(s->s.getPid().equalsIgnoreCase(uid)).collect(Collectors.toList());
            
        return resList.get(0);
    }
    
}
