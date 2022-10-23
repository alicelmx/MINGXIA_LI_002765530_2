/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import static dao.EncounterDao.EncounterRecordJson;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import model.Encounter;
import model.LoginModel;
import model.Person;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class LoginDao {
    
    public static final String loginInfoJson = "../database/LoginInfo.json";
    
    /**
     * search userId by username
     * @param name
     * @return 
     */
    public LoginModel findLoginUserByName(String name) {
      
        File file = new File(LoginDao.class.getResource(loginInfoJson).getPath());
        List<LoginModel> loginModelList = JsonFileUitls.readJsonFileToModel(file, LoginModel.class);
        List<LoginModel> resList = loginModelList.stream().filter(s->s.getUsername().equalsIgnoreCase(name)).collect(Collectors.toList());
            
        return resList.get(0);
    }
    
    public List<LoginModel> queryAllLoginModel() {
        
        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, LoginModel.class);
    }
    
    public void insertNewUser(LoginModel newPatientLoginModel) {
        
        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<LoginModel> allEncounters = queryAllLoginModel();
        allEncounters.add(newPatientLoginModel);
        
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }
}
