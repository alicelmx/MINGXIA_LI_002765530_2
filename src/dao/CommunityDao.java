/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import model.Community;
import org.apache.commons.lang3.ObjectUtils;
import tool.CommunitySerialGenerator;
import tool.GsonUtils;
import tool.JsonFileUitls;

/**
 *
 * @author limingxia
 */
public class CommunityDao {

    public static final String COMMUNITY_JSON = "../database/CommunityList.json";
    public static File file = new File(CommunityDao.class.getResource(COMMUNITY_JSON).getFile());

    static CommunitySerialGenerator serialGenerator = CommunitySerialGenerator.getInstance();

    public static boolean insertNewCommunity(Community community) {
        community.setCid(serialGenerator.next());

        List<Community> communityList = queryAllCommunityList();
        if (communityList.contains(community)) {
            return false;
        }
        communityList.add(community);

        String json = GsonUtils.listToJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static boolean deleteCommunity(Community community) {
        List<Community> communityList = queryAllCommunityList();
        if (!communityList.contains(community)) {
            return false;
        }
        communityList.remove(community);

        String json = GsonUtils.listToJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);

        return true;
    }

    public static void updateCommunity(Community newCommunity, Community oldCommunity) {
        List<Community> communityList = queryAllCommunityList();

        communityList.remove(oldCommunity);
        communityList.add(newCommunity);

        String json = GsonUtils.listToJson(communityList);
        JsonFileUitls.writeModeltoJsonfile(json, file);
    }

    public static Community queryCommunitybByCAdminUser(String userName) {
        List<Community> communityList = JsonFileUitls.readJsonFileToModel(file, Community.class);
        List<Community> res = communityList.stream().filter(s -> s.getCommunityAdminUser().equalsIgnoreCase(userName)).collect(Collectors.toList());

        return ObjectUtils.isEmpty(res) ? null : res.get(0);
    }

    public static List<Community> queryAllCommunityList() {
        List<Community> communityList = JsonFileUitls.readJsonFileToModel(file, Community.class);

        return communityList;
    }

}
