package com.xworkz.faninfo;

import com.xworkz.faninfo.capacitor.Capacitor;
import com.xworkz.faninfo.fan.Fan;

class FanExecuterThree{
    public static void main(String[] game){
        Capacitor capacitor =new Capacitor();
        capacitor.setCapacitorType(" Film Capacitor");
        capacitor.setCapacitorBrand("Havells");
        capacitor.setCapacitorCapacity(3);
        capacitor.setCapacitorVoltage(220.00);
        capacitor.setCapacitorCost(90.00);

        Fan fan=new Fan();
        boolean isCapacitorCreated=fan.creatCapacitor(11,capacitor);
        System.out.println("The Fan capacitor created: "+isCapacitorCreated);

        fan.getFanDetails();
    }
}