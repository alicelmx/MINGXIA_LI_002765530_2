/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import static dao.EncounterDao.EncounterRecordJson;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import model.Doctor;
import model.Encounter;
import model.Hospital;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class DoctorDao {
    
    public static final String doctorInfoJson = "../database/DoctorInfo.json";
    
    /**
     * search userId by username
     * @param did
     * @return 
     */
    public Doctor findDoctorByDid(String did) {
        
        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s->s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
            
        return resList.get(0);
    }
    
    public List<Doctor> queryAllDoctor() {
        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        
        return doctorModelList;
    }
    public void insertNewDoctor(Doctor doctor) {
       
        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorList = queryAllDoctor();
        doctorList.add(doctor);
        
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(doctorList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }
}
