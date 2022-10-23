/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumvalue;

/**
 *
 * @author limingxia
 */
public enum MaritialStatusEnum {
    
    SINGLE("single", 1),
    MARRIED("married", 2),
    DIVORCED("divorced", 3);

    private String status;
    private int index;

    /**
     * MaritialStatusEnum Constructor
     * @param gender
     * @param index 
     */
    MaritialStatusEnum(String gender, int index) {
        this.status = gender;
        this.index = index;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
