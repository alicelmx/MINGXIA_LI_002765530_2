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
import model.Login;
import org.apache.commons.lang3.ObjectUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class LoginDao {

    public static final String loginInfoJson = "../database/LoginInfo.json";

    public static Login queryByUNameAndRoleId(String name, int selectRoleIdx) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getPath());
        List<Login> loginModelList = JsonFileUitls.readJsonFileToModel(file, Login.class);
        if (ObjectUtils.isEmpty(loginModelList)) {
            return null;
        }
        List<Login> resList = loginModelList.stream().filter(
                s -> s.getUserName().equalsIgnoreCase(name)
                && s.getRoleType().equals(selectRoleIdx)
        ).collect(Collectors.toList());
        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }
        return resList.get(0);
    }

    public static List<Login> queryAllLoginModel() {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, Login.class);
    }

    public static boolean insertNewUser(Login newPatientLoginModel) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<Login> allEncounters = queryAllLoginModel();
        if (allEncounters.contains(newPatientLoginModel)) {
            return false;
        }
        allEncounters.add(newPatientLoginModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static Login queryByUserName(String userName) {
        File file = new File(LoginDao.class.getResource(loginInfoJson).getPath());
        List<Login> loginModelList = JsonFileUitls.readJsonFileToModel(file, Login.class);
        if (ObjectUtils.isEmpty(loginModelList)) {
            return null;
        }

        List<Login> resList = loginModelList.stream().filter(
                s -> s.getUserName().equalsIgnoreCase(userName)
        ).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static boolean deleteOldUser(Login oldLoginModel) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<Login> loginModels = queryAllLoginModel();
        if (!loginModels.contains(oldLoginModel)) {
            return false;
        }
        loginModels.remove(oldLoginModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(loginModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteOldUserByUserName(String userName) {
        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<Login> loginModels = queryAllLoginModel();

        List<Login> oldLoginModelList = loginModels.stream().filter(h
                -> h.getUserName().equalsIgnoreCase(userName)
        ).collect(Collectors.toList());
        if (ObjectUtils.isEmpty(oldLoginModelList)) {
            return false;
        }
        Login oldLoginModel = oldLoginModelList.get(0);

        loginModels.remove(oldLoginModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(loginModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }
}
