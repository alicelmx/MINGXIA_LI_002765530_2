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
import model.Encounter;
import org.apache.commons.lang3.ObjectUtils;
import tool.EncounterSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class EncounterDao {

    public static String EncounterRecordJson = "../database/EncounterRecord.json";
    static EncounterSerialGenerator serialGenerator = EncounterSerialGenerator.getInstance();

    public static List<Encounter> queryALlEncounterRecord() {

        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, Encounter.class);
    }

    public static boolean insertNewEncounterRecord(Encounter encounter) {
        encounter.setEid(serialGenerator.next());

        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        List<Encounter> allEncounters = queryALlEncounterRecord();

        if (allEncounters.contains(encounter)) {
            return false;
        }
        allEncounters.add(encounter);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Encounter> queryEncounterByPID(String patientID) {
        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        List<Encounter> allEncounters = JsonFileUitls.readJsonFileToModel(file, Encounter.class);
        List<Encounter> res = allEncounters.stream().filter(s -> s.getPid().equalsIgnoreCase(patientID)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res;
    }

    public static List<Encounter> queryEncounterByHID(String HospitalID) {
        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        List<Encounter> allEncounters = JsonFileUitls.readJsonFileToModel(file, Encounter.class);
        List<Encounter> res = allEncounters.stream().filter(s -> s.getHid().equalsIgnoreCase(HospitalID)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res;
    }
}
