/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Doctor;
import org.apache.commons.lang3.ObjectUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;
import tool.serial.DoctorSerialGenerator;

/**
 *
 * @author limingxia
 */
public class DoctorDao {

    public static final String DOCTOR_INFO_JSON = "../database/DoctorInfo.json";
    public static File file = new File(DoctorDao.class.getResource(DOCTOR_INFO_JSON).getFile());

    static DoctorSerialGenerator serialGenerator = DoctorSerialGenerator.getInstance();

    public static boolean insertNewDoctor(Doctor doctor) {
        doctor.setDid(serialGenerator.next());

        List<Doctor> doctorList = queryAllDoctor();

        if (doctorList.contains(doctor)) {
            return false;
        }

        doctorList.add(doctor);

        String json = GsonUtils.listToJson(doctorList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteDoctor(Doctor selectedDoctor) {

        List<Doctor> doctorList = queryAllDoctor();

        if (!doctorList.contains(selectedDoctor)) {
            return false;
        }

        doctorList.remove(selectedDoctor);

        String json = GsonUtils.listToJson(doctorList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static Doctor queryDoctorByDid(String did) {

        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
        if (ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList.get(0);
    }

    public static List<Doctor> queryAllDoctor() {
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);

        return doctorModelList;
    }

    public static List<Doctor> queryAllDoctorOfHospital(String hId) {
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getHid().equalsIgnoreCase(hId)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(doctorModelList) ? null : resList;
    }

    public static Doctor queryDoctorByUserName(String userName) {

        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getUsername().equalsIgnoreCase(userName)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList.get(0);
    }

    public static boolean updateDoctor(Doctor newDoctor, Doctor oldDoctor) {
        newDoctor.setDid(oldDoctor.getDid());

        List<Doctor> doctorModelList = queryAllDoctor();
        if (doctorModelList.contains(newDoctor) || !doctorModelList.contains(oldDoctor)) {
            return false;
        }
        doctorModelList.remove(oldDoctor);
        doctorModelList.add(newDoctor);

        String json = GsonUtils.listToJson(doctorModelList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Doctor> queryDoctorByHid(String hid) {
        List<Doctor> doctorModelList = JsonFileUitls.readJsonFileToModel(file, Doctor.class);
        List<Doctor> resList = doctorModelList.stream().filter(s -> s.getHid().equalsIgnoreCase(hid)).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(doctorModelList)) {
            return null;
        }
        return resList;
    }
}
