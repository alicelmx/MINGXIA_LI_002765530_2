/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author limingxia
 */
public class EncounterHistory {

    private List<Encounter> encounterHistory;

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof EncounterHistory)) {
            return false;
        }

        EncounterHistory e = (EncounterHistory) obj;

        return Objects.equals(encounterHistory, e.getEncounterHistory());
    }

    public List<Encounter> searchByKeyword(String keyword) {

        List<Encounter> res = encounterHistory.stream().filter(
                s -> s.getDatetime().equalsIgnoreCase(keyword)
                || s.getdName().equalsIgnoreCase(keyword)
                || s.gethName().equalsIgnoreCase(keyword)
                || s.getDeptment().equalsIgnoreCase(keyword)
        ).collect(Collectors.toList());

        return res;
    }

}
