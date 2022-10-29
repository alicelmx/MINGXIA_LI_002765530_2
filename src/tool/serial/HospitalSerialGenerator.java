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
public class HospitalSerialGenerator {

    public static final String HOSPITAL_ID_PREFIX = "H_";

    private long id = 1;

    private static final HospitalSerialGenerator INSTANCE = new HospitalSerialGenerator();

    private HospitalSerialGenerator() {
    }

    public synchronized String next() {

        return HOSPITAL_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static HospitalSerialGenerator getInstance() {

        return INSTANCE;
    }
}
