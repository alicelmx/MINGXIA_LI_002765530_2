/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Appointment;
import org.apache.commons.lang3.ObjectUtils;
import tool.DateUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;
import tool.serial.AppointmentSerialGenerator;

/**
 *
 * @author limingxia
 */
public class AppointmentDao {

    public static final String DOCTOR_INFO_JSON = "../database/AppointmentList.json";
    public static File file = new File(AppointmentDao.class.getResource(DOCTOR_INFO_JSON).getFile());

    static AppointmentSerialGenerator serialGenerator = AppointmentSerialGenerator.getInstance();

    public static boolean insertNewAppointment(Appointment appointment) {
        appointment.setAid(serialGenerator.next());

        List<Appointment> appointmentList = queryAllAppointment();
        // duplicate
        if (appointmentList.contains(appointment)) {
            return false;
        }

        appointmentList.add(appointment);

        String json = GsonUtils.listToJson(appointmentList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;

    }

    public static boolean deleteAppointment(Appointment appointmentModel) {
        List<Appointment> appointmentModels = queryAllAppointment();

        if (!appointmentModels.contains(appointmentModel)) {
            return false;
        }
        // delete first
        appointmentModels.remove(appointmentModel);

        String json = GsonUtils.listToJson(appointmentModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean updateAppointmentStatus(Appointment appointmentModel) {

        List<Appointment> appointmentModels = queryAllAppointment();

        if (!appointmentModels.contains(appointmentModel)) {
            return false;
        }
        // delete first
        appointmentModels.remove(appointmentModel);
        // insert new one
        appointmentModel.setStatus(1);
        appointmentModels.add(appointmentModel);

        String json = GsonUtils.listToJson(appointmentModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Appointment> queryTodayAppointmentByDId(String dId) {
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);
        if (ObjectUtils.isEmpty(appointmentList)) {
            return null;
        }
        String now = DateUtils.getCurrentTimeCustomFormat();
        return appointmentList.stream().filter(s
                -> s.getDid().equalsIgnoreCase(dId) && s.getStatus() != 1
                && s.getDatetime().equals(now)
        ).collect(Collectors.toList());
    }

    public static List<Appointment> queryAllAppointment() {
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);

        return appointmentList;
    }

    public static List<Appointment> queryAppointmentByPid(String userId) {
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);
        if (ObjectUtils.isEmpty(appointmentList)) {
            return null;
        }
        List<Appointment> resList = appointmentList.stream().filter(s -> s.getPid().equalsIgnoreCase(userId)).collect(Collectors.toList());

        return resList;
    }

    public static List<Appointment> queryProcessingAppointmentByDId(String did) {
        List<Appointment> appointmentList = JsonFileUitls.readJsonFileToModel(file, Appointment.class);
        if (ObjectUtils.isEmpty(appointmentList)) {
            return null;
        }
        List<Appointment> resList = appointmentList.stream().filter(s
                -> s.getDid().equalsIgnoreCase(did)
                && s.getStatus().equals(0)
        ).collect(Collectors.toList());

        return resList;
    }
}
