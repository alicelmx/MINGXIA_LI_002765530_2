/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 * 
 * @author limingxia
 */
public class VitalSign {
    
    private double bloodPressure;
    private double pulseRate;
    private double respirationRate;
    private double bodyTemperature;

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof VitalSign)) {
            return false;
        }

        VitalSign vitalSign = (VitalSign) obj;

        return Objects.equals(bloodPressure, vitalSign.getBloodPressure())
                && Objects.equals(bodyTemperature, vitalSign.getBodyTemperature())
                && Objects.equals(pulseRate, vitalSign.getPulseRate())
                && Objects.equals(respirationRate, vitalSign.getRespirationRate());   
    }

    
}
