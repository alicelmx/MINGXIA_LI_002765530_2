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
public class AppointmentSerialGenerator {

    public static final String APPOINTMENT_ID_PREFIX = "A_";

    private long id = 1;

    private static final AppointmentSerialGenerator INSTANCE = new AppointmentSerialGenerator();

    private AppointmentSerialGenerator() {
    }

    public synchronized String next() {
        return APPOINTMENT_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static AppointmentSerialGenerator getInstance() {

        return INSTANCE;
    }
}
