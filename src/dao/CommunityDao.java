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
import model.Community;
import org.apache.commons.lang3.ObjectUtils;
import tool.CommunitySerialGenerator;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class CommunityDao {

    public static final String communityListJson = "../database/CommunityList.json";

    static CommunitySerialGenerator serialGenerator = CommunitySerialGenerator.getInstance();

    public static List<Community> queryAllCommunityList() {

        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = JsonFileUitls.readJsonFileToModel(file, Community.class);

        return communityList;
    }

    public static boolean insertNewCommunity(Community community) {
        community.setCid(serialGenerator.next());

        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = queryAllCommunityList();

        if (communityList.contains(community)) {
            return false;
        }
        communityList.add(community);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static void deleteCommunity(Community community) {
        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = queryAllCommunityList();
        communityList.remove(community);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }

    public static void updateCommunity(Community newCommunity, Community oldCommunity) {
        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = queryAllCommunityList();

        communityList.remove(oldCommunity);
        communityList.add(newCommunity);

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }

    public static Community queryCommunitybByCName(String community) {
        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = JsonFileUitls.readJsonFileToModel(file, Community.class);
        List<Community> res = communityList.stream().filter(s -> s.getcName().equalsIgnoreCase(community)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res.get(0);
    }

    public static Community queryCommunitybByCAdminUser(String userName) {
        File file = new File(CommunityDao.class.getResource(communityListJson).getFile());
        List<Community> communityList = JsonFileUitls.readJsonFileToModel(file, Community.class);
        List<Community> res = communityList.stream().filter(s -> s.getCommunityAdminUser().equalsIgnoreCase(userName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res.get(0);
    }

}
