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
import model.Hospital;
import model.Patient;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;

/**
 *
 * @author limingxia
 */
public class HospitalDao {
    public static final String hopitalInfoJson = "../database/HospitalInfo.json";
    
    /**
     * search userId by username
     * @param zipcode
     * @return 
     */
    public List<Hospital> findHospitalByZipcode(String zipcode) {
        List<Hospital> hospitalModelList = null;

        var file = new File(HospitalDao.class.getResource(hopitalInfoJson).getFile());
        try {
            String json = FileUtils.readFileToString(file,"utf-8");
            // TODO 这里序列化可能有问题
            hospitalModelList = GsonUtils.parseJsonArrayWithGson(json, Hospital.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Hospital> resList = hospitalModelList.stream().filter(s->s.getZipcode().equalsIgnoreCase(zipcode)).collect(Collectors.toList());
            
        return resList;
    }
    
    /**
     * search userId by username
     * @param zipcode
     * @return 
     */
    public List<Hospital> findNearDoctorsByZipcode(String zipcode) {
        List<Hospital> patientModelList = null;
        // TODO 这里可能会有层级问题
        var file = new File(HospitalDao.class.getResource(hopitalInfoJson).getFile());
        try {
            String json = FileUtils.readFileToString(file,"utf-8");
            // TODO 这里序列化可能有问题
            patientModelList = GsonUtils.parseJsonArrayWithGson(json, Hospital.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Hospital> resList = patientModelList.stream().filter(s->s.getZipcode().equalsIgnoreCase(zipcode)).collect(Collectors.toList());
            
        return resList;
    }
    
}
