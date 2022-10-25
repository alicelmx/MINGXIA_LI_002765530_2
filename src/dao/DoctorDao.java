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
import org.apache.commons.lang3.ObjectUtils;
import tool.DoctorSerialGenerator;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class DoctorDao {

    public static final String doctorInfoJson = "../database/DoctorInfo.json";

    DoctorSerialGenerator serialGenerator = DoctorSerialGenerator.getInstance();

    /**
     * search userId by username
     *
     * @param did
     * @return
     */
    public Doctor findDoctorByDid(String did) {

        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
        if(ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList.get(0);
    }

    public List<Doctor> queryAllDoctor() {
        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);

        return doctorModelList;
    }

    public boolean insertNewDoctor(Doctor doctor) {
        doctor.setDid(serialGenerator.next());

        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorList = queryAllDoctor();
        
        if(doctorList.contains(doctor)) return false;
        
        doctorList.add(doctor);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(doctorList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
        return true;
    }
    
    public Doctor queryDoctorByUserName(String userName) {

        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getUsername().equalsIgnoreCase(userName)).collect(Collectors.toList());
        
        if(ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList.get(0);
    }

    public Doctor findDoctorByDName(String dName) {
        File file = new File(DoctorDao.class.getResource(doctorInfoJson).getFile());
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> (s.getFirstName()+" "+s.getLastName()).equalsIgnoreCase(dName)).collect(Collectors.toList());
        
        if(ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList.get(0);
    }
}
