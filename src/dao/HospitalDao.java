/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Community;
import model.Hospital;
import org.apache.commons.lang3.ObjectUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;
import tool.serial.HospitalSerialGenerator;

/**
 *
 * @author limingxia
 */
public class HospitalDao {

    public static final String HOSPITAL_INFO_JSON = "../database/HospitalInfo.json";
    public static File file = new File(HospitalDao.class.getResource(HOSPITAL_INFO_JSON).getFile());

    static HospitalSerialGenerator serialGenerator = HospitalSerialGenerator.getInstance();

    public static boolean insertNewHospital(Hospital hospital) {
        hospital.setHid(serialGenerator.next());

        List<Hospital> hospitalList = queryHospitalList();
        if (hospitalList.contains(hospital)) {
            return false;
        }
        hospitalList.add(hospital);

        String json = GsonUtils.listToJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteHospital(Hospital selectedHospital) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);

        if (!hospitalModelList.contains(selectedHospital)) {
            return false;
        }

        hospitalModelList.remove(selectedHospital);

        String json = GsonUtils.listToJson(hospitalModelList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean updateHospital(Hospital newHospital, Hospital oldHospital) {
        newHospital.setHid(oldHospital.getHid());

        List<Hospital> hospitalList = queryHospitalList();
        if (hospitalList.contains(newHospital)) {
            return false;
        }

        if (!hospitalList.contains(oldHospital)) {
            return false;
        }
        hospitalList.remove(oldHospital);
        hospitalList.add(newHospital);

        String json = GsonUtils.listToJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Hospital> queryHospitalByCommunity(String community) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(community)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

    public static Hospital queryHospitalByAdminName(String haName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getHospitalAdminUserName().equalsIgnoreCase(haName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static List<Hospital> queryHospitalListByCommunity(String curCommunityName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.getCommunity().equalsIgnoreCase(curCommunityName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList;
    }

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

    public static Hospital queryHospitalByHName(String hName) {
        List<Hospital> hospitalModelList = JsonFileUitls.readJsonFileToModel(file, Hospital.class);
        List<Hospital> resList = hospitalModelList.stream().filter(s -> s.gethName().equalsIgnoreCase(hName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static boolean updateHospitaltCommunity(String oldCName, String newCName) {
        List<Hospital> hospitalList = queryHospitalList();

        for (Hospital h : hospitalList) {
            if (h.getCommunity().equals(oldCName)) {
                Community newC = CommunityDao.queryCommunityListByCName(newCName);
                h.setCommunity(newCName);
                h.setCity(newC.getCity());
            }
        }

        String json = GsonUtils.listToJson(hospitalList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }
}
