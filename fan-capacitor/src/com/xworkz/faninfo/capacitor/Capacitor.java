package com.xworkz.faninfo.capacitor;


public class Capacitor{
    private String capacitorType;
    private String capacitorBrand;
    private int capacitorCapacity;
    private double capacitorVoltage;
    private double capacitorCost;

    public void setCapacitorBrand(String capacitorBrand) {
        this.capacitorBrand = capacitorBrand;
    }

    public void setCapacitorType(String capacitorType) {
        this.capacitorType = capacitorType;
    }

    public void setCapacitorCapacity(int capacitorCapacity) {
        this.capacitorCapacity = capacitorCapacity;
    }

    public void setCapacitorCost(double capacitorCost) {
        this.capacitorCost = capacitorCost;
    }

    public void setCapacitorVoltage(double capacitorVoltage) {
        this.capacitorVoltage = capacitorVoltage;
    }

    public double getCapacitorCost() {
        return capacitorCost;
    }

    public double getCapacitorVoltage() {
        return capacitorVoltage;
    }

    public int getCapacitorCapacity() {
        return capacitorCapacity;
    }

    public String getCapacitorBrand() {
        return capacitorBrand;
    }

    public String getCapacitorType() {
        return capacitorType;
    }
}
