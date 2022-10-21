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
import model.Doctor;
import model.Hospital;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;

/**
 *
 * @author limingxia
 */
public class DoctorDao {
    
    public static final String doctorInfoJson = "DoctorInfo.json";
    public static final Type type = new TypeToken<List<Doctor>>() {}.getType();
    
    /**
     * search userId by username
     * @param did
     * @return 
     */
    public List<Doctor> findDoctorByDid(String did) {
        List<Doctor> patientModelList = null;
        // TODO 这里可能会有层级问题
        var file = new File(HospitalDao.class.getResource(doctorInfoJson).getFile());
        try {
            String json = FileUtils.readFileToString(file,"utf-8");
            // TODO 这里序列化可能有问题
            patientModelList = GsonUtils.parseJsonArrayWithGson(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Doctor> resList = patientModelList.stream().filter(s->s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
            
        return resList;
    }
}
