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
import model.AppointmentModel;
import org.apache.commons.lang3.ObjectUtils;
import tool.AppointmentSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class AppointmentDao {

    public static final String doctorInfoJson = "../database/AppointmentList.json";

    AppointmentSerialGenerator serialGenerator = AppointmentSerialGenerator.getInstance();

    /**
     * search userId by username
     *
     * @param dName
     * @return
     */
    public List<AppointmentModel> queryAppointmentByDid(String dName) {

        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> appointmentModelList = JsonFileUitls.readJsonFileToModel(file, AppointmentModel.class);
        if(ObjectUtils.isEmpty(appointmentModelList)) {
            return null;
        }
        return appointmentModelList.stream().filter(s -> s.getdName().equalsIgnoreCase(dName) && s.getStatus() != 1).collect(Collectors.toList());
    }

    public List<AppointmentModel> queryAllAppointment() {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> appointmentModelList = JsonFileUitls.readJsonFileToModel(file, AppointmentModel.class);

        return appointmentModelList;
    }

    public boolean insertNewAppointment(AppointmentModel appointmentModel) {
        appointmentModel.setAid(serialGenerator.next());

        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> allEncounters = queryAllAppointment();
        // duplicate
        if(allEncounters.contains(appointmentModel)) return false;
        
        allEncounters.add(appointmentModel);
        
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
        return true;

    }

    public List<AppointmentModel> queryAppointmentByPid(String userId) {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> appointmentModelList = JsonFileUitls.readJsonFileToModel(file, AppointmentModel.class);
        if(ObjectUtils.isEmpty(appointmentModelList)) {
            return null;
        }
        List<AppointmentModel> resList = appointmentModelList.stream().filter(s -> s.getpName().equalsIgnoreCase(userId)).collect(Collectors.toList());

        return resList;
    }
}
