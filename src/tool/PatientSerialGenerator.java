/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

/**
 *
 * @author limingxia
 */
public class PatientSerialGenerator {

    public static final String PATIENT_ID_PREFIX = "P_";

    private long id = 1;

    private static final PatientSerialGenerator INSTANCE = new PatientSerialGenerator();

    private PatientSerialGenerator() {
    }

    public synchronized String next() {

        return PATIENT_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static PatientSerialGenerator getInstance() {

        return INSTANCE;
    }
}
