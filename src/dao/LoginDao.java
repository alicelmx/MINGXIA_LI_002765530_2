/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Login;
import org.apache.commons.lang3.ObjectUtils;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class LoginDao {

    public static final String LOGIN_INFO_JSON = "../database/LoginInfo.json";
    public static File file = new File(LoginDao.class.getResource(LOGIN_INFO_JSON).getPath());

    public static boolean insertNewUser(Login newPatientLoginModel) {
        List<Login> allEncounters = queryAllLoginModel();
        if (allEncounters.contains(newPatientLoginModel)) {
            return false;
        }
        allEncounters.add(newPatientLoginModel);

        String json = GsonUtils.listToJson(allEncounters);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteOldUser(Login oldLoginModel) {
        List<Login> loginModels = queryAllLoginModel();
        if (!loginModels.contains(oldLoginModel)) {
            return false;
        }
        loginModels.remove(oldLoginModel);

        String json = GsonUtils.listToJson(loginModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteOldUserByUserName(String userName) {
        List<Login> loginModels = queryAllLoginModel();

        List<Login> oldLoginModelList = loginModels.stream().filter(h
                -> h.getUserName().equalsIgnoreCase(userName)
        ).collect(Collectors.toList());
        if (ObjectUtils.isEmpty(oldLoginModelList)) {
            return false;
        }
        Login oldLoginModel = oldLoginModelList.get(0);

        loginModels.remove(oldLoginModel);

        String json = GsonUtils.listToJson(loginModels);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static Login queryByUserName(String userName) {
        List<Login> loginModelList = JsonFileUitls.readJsonFileToModel(file, Login.class);
        if (ObjectUtils.isEmpty(loginModelList)) {
            return null;
        }

        List<Login> resList = loginModelList.stream().filter(
                s -> s.getUserName().equalsIgnoreCase(userName)
        ).collect(Collectors.toList());

        return ObjectUtils.isEmpty(resList) ? null : resList.get(0);
    }

    public static Login queryByUNameAndRoleId(String name, int selectRoleIdx) {

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
        return JsonFileUitls.readJsonFileToModel(file, Login.class);
    }

}
