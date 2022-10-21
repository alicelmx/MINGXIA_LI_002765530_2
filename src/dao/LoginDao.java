/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import model.LoginModel;
import model.Person;
import org.apache.commons.io.FileUtils;
import tool.GsonUtils;

/**
 *
 * @author limingxia
 */
public class LoginDao {
    
    public static final String loginInfoJson = "LoginInfo.json";
    public static final Type type = new TypeToken<List<LoginModel>>() {}.getType();
    
    /**
     * search userId by username
     * @param name
     * @return 
     */
    public LoginModel findLoginUserByName(String name) {
        List<LoginModel> loginModelList = null;
        // TODO 这里可能会有层级问题
        var file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        try {
            String json = FileUtils.readFileToString(file,"utf-8");
            // TODO 这里序列化可能有问题
            loginModelList = GsonUtils.parseJsonArrayWithGson(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<LoginModel> resList = loginModelList.stream().filter(s->s.getUsername().equalsIgnoreCase(name)).collect(Collectors.toList());
            
        return resList.get(0);
    }
}
