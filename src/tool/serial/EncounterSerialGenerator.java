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
public class EncounterSerialGenerator {

    public static final String ENCOUNTER_ID_PREFIX = "E_";

    private long id = 1;

    private static final EncounterSerialGenerator INSTANCE = new EncounterSerialGenerator();

    private EncounterSerialGenerator() {
    }

    public synchronized String next() {

        return ENCOUNTER_ID_PREFIX + DateUtils.getSerialDate() + "_" + id++;
    }

    public static EncounterSerialGenerator getInstance() {

        return INSTANCE;
    }
}
