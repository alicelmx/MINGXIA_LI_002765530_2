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
import model.Hospital;
import org.apache.commons.lang3.ObjectUtils;
import tool.HospitalSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class HospitalDao {

    static HospitalSerialGenerator serialGenerator = HospitalSerialGenerator.getInstance();

    public static String hopitalInfoJson = "../database/HospitalInfo.json";
    public static File file = new File(HospitalDao.class.getResource(hopitalInfoJson).getFile());

    public static List<Hospital> queryHospitalByZipcode(String zipcode) {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        return hospitalModelList.stream().filter(s -> s.getZipCode().equalsIgnoreCase(zipcode)).collect(Collectors.toList());
    }

    public static Hospital queryHospitalByHID(String hid) {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getHid().equalsIgnoreCase(hid)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static List<Hospital> queryHospitalList() {

        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        return hospitalModelList;
    }

    public static boolean insertNewHospital(Hospital hospital) {
        hospital.setHid(serialGenerator.next());

        List<Hospital> hospitalList = queryHospitalList();

        if (hospitalList.contains(hospital)) {
            return false;
        }
        hospitalList.add(hospital);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Hospital> findHospitalByCommunity(String community) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(community)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

    public static Hospital queryHospitalByHName(String hospitalName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.gethName().equalsIgnoreCase(hospitalName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static Hospital queryHospitalByAdminName(String haName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getHospitalAdminUserName().equalsIgnoreCase(haName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static void updateHospital(Hospital newHospital, Hospital oldHospital) {

        List<Hospital> hospitalList = queryHospitalList();
        hospitalList.remove(oldHospital);
        hospitalList.add(newHospital);
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

    }

    public static boolean deleteHospital(Hospital selectedHospital) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        if (!hospitalModelList.contains(selectedHospital)) {
            return false;
        }

        hospitalModelList.remove(selectedHospital);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(hospitalModelList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Hospital> queryHospitalListByCommunity(String curCommunityName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(curCommunityName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }
}
