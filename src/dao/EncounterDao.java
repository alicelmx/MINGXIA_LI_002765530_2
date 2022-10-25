/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.List;
import model.Encounter;
import tool.EncounterSerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class EncounterDao {
    
    public static final String EncounterRecordJson = "../database/EncounterRecord.json";
    EncounterSerialGenerator serialGenerator = EncounterSerialGenerator.getInstance();
    
    /**
     * search userId by username
     * @param zipcode
     * @return 
     */
    public List<Encounter> queryALlEncounterRecord() {
        
        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, Encounter.class);
    }
    
    public boolean insertNewEncounterRecord(Encounter encounter) {
        encounter.setEid(serialGenerator.next());
        
        File file = new File(EncounterDao.class.getResource(EncounterRecordJson).getFile());
        List<Encounter> allEncounters = queryALlEncounterRecord();
        
        if(allEncounters.contains(encounter)) return false;
        allEncounters.add(encounter);
        
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);
        
        return true;
    }
}
