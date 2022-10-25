/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

/**
 *
 * @author limingxia
 */
public class DoctorSerialGenerator {
    
    public static final String DOCTOR_ID_PREFIX = "D_";

    private long id = 1;

    private static final DoctorSerialGenerator INSTANCE = new DoctorSerialGenerator();

    private DoctorSerialGenerator() {
    }

    public synchronized String next() {

        return DOCTOR_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static DoctorSerialGenerator getInstance() {

        return INSTANCE;
    }
}
