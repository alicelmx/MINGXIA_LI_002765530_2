/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static dao.PatientDao.patientInfoJson;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import model.AppointmentModel;
import model.Doctor;
import model.Patient;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class AppointmentDao {
    
    public static final String doctorInfoJson = "../database/AppointmentList.json";
    
    /**
     * search userId by username
     * @param did
     * @return 
     */
    public List<AppointmentModel> queryAppointmentByDid(String did) {
       
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> appointmentModelList = JsonFileUitls.readJsonFileToModel(file, AppointmentModel.class);
        List<AppointmentModel> resList = appointmentModelList.stream().filter(s->s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
            
        return appointmentModelList.stream().filter(s->s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());
    }
    
    public List<AppointmentModel> queryAllAppointment() {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> appointmentModelList = JsonFileUitls.readJsonFileToModel(file, AppointmentModel.class);
        
        return appointmentModelList;
    }
    
    public void insertNewAppointment(AppointmentModel appointmentModel) {
        
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<AppointmentModel> allEncounters = queryAllAppointment();
        allEncounters.add(appointmentModel);
        
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
    }
}
