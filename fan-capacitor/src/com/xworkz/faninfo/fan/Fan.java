package com.xworkz.faninfo.fan;

import com.xworkz.faninfo.capacitor.Capacitor;

public class Fan{
    int fanId;
    Capacitor capacitor;

    public boolean creatCapacitor(int fanId,Capacitor capacitor){
        boolean isCapacitorCreated=false;
        this.fanId=fanId;
        this.capacitor=capacitor;
        isCapacitorCreated=true;
        return isCapacitorCreated;
    }
    public void getFanDetails(){
        System.out.println("The Fan id is: "+fanId);
        System.out.println("The type of the capacitor is: "+capacitor.getCapacitorType());
        System.out.println("The brand of the capacitor is: "+capacitor.getCapacitorBrand());
        System.out.println("The capacity of the capacitor is: "+capacitor.getCapacitorCapacity());
        System.out.println("The voltage of the capacitor is: "+capacitor.getCapacitorVoltage());
        System.out.println("The cost of the capacitor is: "+capacitor.getCapacitorCost());
    }
}

