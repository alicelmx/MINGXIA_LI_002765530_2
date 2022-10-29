/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Encounter;
import org.apache.commons.lang3.ObjectUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;
import tool.serial.EncounterSerialGenerator;

/**
 *
 * @author limingxia
 */
public class EncounterDao {

    public static final String ENCOUNTER_RECORD_JSON = "../database/EncounterRecord.json";
    public static File file = new File(EncounterDao.class.getResource(ENCOUNTER_RECORD_JSON).getFile());

    static EncounterSerialGenerator serialGenerator = EncounterSerialGenerator.getInstance();

    public static boolean insertNewEncounterRecord(Encounter encounter) {
        encounter.setEid(serialGenerator.next());

        List<Encounter> allEncounters = queryALlEncounterRecord();

        if (allEncounters.contains(encounter)) {
            return false;
        }
        allEncounters.add(encounter);

        String json = GsonUtils.listToJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static List<Encounter> queryEncounterByPID(String patientID) {
        List<Encounter> allEncounters = JsonFileUitls.readJsonFileToModel(file, Encounter.class);
        List<Encounter> res = allEncounters.stream().filter(s -> s.getPid().equalsIgnoreCase(patientID)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res;
    }

    public static List<Encounter> queryEncounterByHID(String HospitalID) {
        List<Encounter> allEncounters = JsonFileUitls.readJsonFileToModel(file, Encounter.class);
        List<Encounter> res = allEncounters.stream().filter(s -> s.getHid().equalsIgnoreCase(HospitalID)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res;
    }

    public static List<Encounter> queryALlEncounterRecord() {

        return JsonFileUitls.readJsonFileToModel(file, Encounter.class);
    }

    public static List<Encounter> queryEncounterByDid(String did) {
        List<Encounter> allEncounters = JsonFileUitls.readJsonFileToModel(file, Encounter.class);
        List<Encounter> res = allEncounters.stream().filter(s -> s.getDid().equalsIgnoreCase(did)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res;
    }
}
