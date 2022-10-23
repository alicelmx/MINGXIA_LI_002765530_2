/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumvalue;

/**
 *
 * @author limingxia
 */
public enum RoleEnum {

    SYSTEM_ADMIN("System Admin", 0),
    COMMUNITY_ADMIN("Community Admin", 1),
    HOSPITAL_ADMIN("Hospital Admin", 2),
    DOCTOR("Doctor", 3),
    PATIENT("Patient", 4);

    private String role;
    private int index;

    /**
     * RoleEnum Constructor
     *
     * @param name
     * @param index
     */
    RoleEnum(String name, int index) {
        this.role = name;
        this.index = index;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
