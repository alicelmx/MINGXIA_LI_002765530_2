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
import model.Appointment;
import org.apache.commons.lang3.ObjectUtils;
import tool.AppointmentSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class AppointmentDao {

    public static String doctorInfoJson = "../database/AppointmentList.json";

    static AppointmentSerialGenerator serialGenerator = AppointmentSerialGenerator.getInstance();

    public static List<Appointment> queryAppointmentByDId(String dId) {

        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);
        if (ObjectUtils.isEmpty(appointmentList)) {
            return null;
        }
        return appointmentList.stream().filter(s -> s.getDid().equalsIgnoreCase(dId) && s.getStatus() != 1).collect(Collectors.toList());
    }

    public static List<Appointment> queryAllAppointment() {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);

        return appointmentList;
    }

    public static boolean insertNewAppointment(Appointment appointment) {
        appointment.setAid(serialGenerator.next());

        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentList = queryAllAppointment();
        // duplicate
        if (appointmentList.contains(appointment)) {
            return false;
        }

        appointmentList.add(appointment);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(appointmentList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;

    }

    public static List<Appointment> queryAppointmentByPid(String userId) {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);
        if (ObjectUtils.isEmpty(appointmentList)) {
            return null;
        }
        List<Appointment> resList = appointmentList.stream().filter(s -> s.getpName().equalsIgnoreCase(userId)).collect(Collectors.toList());

        return resList;
    }

    public static boolean updateAppointmentStatus(Appointment appointmentModel) {

        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentModels = queryAllAppointment();

        if (!appointmentModels.contains(appointmentModel)) {
            return false;
        }
        // delete first
        appointmentModels.remove(appointmentModel);
        // insert new one
        appointmentModel.setStatus(1);
        appointmentModels.add(appointmentModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(appointmentModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteAppointment(Appointment appointmentModel) {
        File file = new File(AppointmentDao.class.getResource(doctorInfoJson).getFile());
        List<Appointment> appointmentModels = queryAllAppointment();

        if (!appointmentModels.contains(appointmentModel)) {
            return false;
        }
        // delete first
        appointmentModels.remove(appointmentModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(appointmentModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }
}
