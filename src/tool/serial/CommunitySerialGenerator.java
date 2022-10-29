/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool.serial;

import tool.DateUtils;

/**
 *
 * @author limingxia
 */
public class CommunitySerialGenerator {

    public static final String COMMUNITY_ID_PREFIX = "C_";

    private long id = 1;

    private static final CommunitySerialGenerator INSTANCE = new CommunitySerialGenerator();

    private CommunitySerialGenerator() {
    }

    public synchronized String next() {

        return COMMUNITY_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static CommunitySerialGenerator getInstance() {

        return INSTANCE;
    }
}
