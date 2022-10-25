/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Hospital;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import tool.GsonUtils;
import tool.HospitalSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class HospitalDao {

    public static final String hopitalInfoJson = "../database/HospitalInfo.json";
    HospitalSerialGenerator serialGenerator = HospitalSerialGenerator.getInstance();

    public File file = new File(HospitalDao.class.getResource(hopitalInfoJson).getFile());

    /**
     * search userId by username
     *
     * @param zipcode
     * @return
     */
    public List<Hospital> findHospitalByZipcode(String zipcode) {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        return hospitalModelList.stream().filter(s -> s.getZipCode().equalsIgnoreCase(zipcode)).collect(Collectors.toList());
    }

    public Hospital queryHospitalByHID(String hid) {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getHid().equalsIgnoreCase(hid)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public List<Hospital> queryHospitalList() {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        return hospitalModelList;
    }

    public boolean insertNewHospital(Hospital hospital) {
        hospital.setHid(serialGenerator.next());

        File file = new File(getClass().getResource(hopitalInfoJson).getFile());
        List<Hospital> hospitalList = queryHospitalList();
        
        if(hospitalList.contains(hospital)) return false;
        hospitalList.add(hospital);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
        return true;
    }

    public List<Hospital> findHospitalByCommunity(String community) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(community)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

    public Hospital queryHospitalByHName(String hospitalName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.gethName().equalsIgnoreCase(hospitalName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public void updateHospital(Hospital newHospital, Hospital oldHospital) {

        File file = new File(getClass().getResource(hopitalInfoJson).getFile());
        List<Hospital> hospitalList = queryHospitalList();
        hospitalList.remove(oldHospital);
        hospitalList.add(newHospital);
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
    }
}
