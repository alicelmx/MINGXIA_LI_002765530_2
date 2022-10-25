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
import model.LoginModel;
import org.apache.commons.lang3.ObjectUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class LoginDao {

    public static final String loginInfoJson = "../database/LoginInfo.json";

    /**
     * @param name the value of name
     * @param selectRoleIdx the value of selectRoleIdx
     * @return LoginModel
     */
    public static LoginModel findLoginUserByName(String name, int selectRoleIdx) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getPath());
        List<LoginModel> loginModelList = JsonFileUitls.readJsonFileToModel(file, LoginModel.class);
        if (ObjectUtils.isEmpty(loginModelList)) {
            return null;
        }
        List<LoginModel> resList = loginModelList.stream().filter(
                s -> s.getUserName().equalsIgnoreCase(name)
                && s.getRoleType().equals(selectRoleIdx)
        ).collect(Collectors.toList());
        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }
        return resList.get(0);
    }

    public static List<LoginModel> queryAllLoginModel() {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        return JsonFileUitls.readJsonFileToModel(file, LoginModel.class);
    }

    public static boolean insertNewUser(LoginModel newPatientLoginModel) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<LoginModel> allEncounters = queryAllLoginModel();
        if (allEncounters.contains(newPatientLoginModel)) {
            return false;
        }
        allEncounters.add(newPatientLoginModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static LoginModel queryByUserName(String userName) {
        File file = new File(LoginDao.class.getResource(loginInfoJson).getPath());
        List<LoginModel> loginModelList = JsonFileUitls.readJsonFileToModel(file, LoginModel.class);
        if (ObjectUtils.isEmpty(loginModelList)) {
            return null;
        }

        List<LoginModel> resList = loginModelList.stream().filter(
                s -> s.getUserName().equalsIgnoreCase(userName)
        ).collect(Collectors.toList());

        if (ObjectUtils.isEmpty(resList)) {
            return null;
        }

        return resList.get(0);
    }

    public static boolean deleteOldUser(LoginModel oldLoginModel) {

        File file = new File(LoginDao.class.getResource(loginInfoJson).getFile());
        List<LoginModel> loginModels = queryAllLoginModel();
        if (!loginModels.contains(oldLoginModel)) {
            return false;
        }
        loginModels.remove(oldLoginModel);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(loginModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }
}
