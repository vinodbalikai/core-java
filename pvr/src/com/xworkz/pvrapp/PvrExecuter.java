package com.xworkz.pvrapp;

import com.xworkz.pvrapp.pvr.Pvr;
import com.xworkz.pvrapp.screen.Screen;

public class PvrExecuter {
    public static void main(String[] args) {
        Pvr pvr=new Pvr();
        Screen screen=new Screen();
        screen.setScreenId(17);
        screen.setScreenNo(2);
        screen.setScreenType("Dolby Atoms");

        pvr.addScreen(screen);

        pvr.getScreenDetails();
    }
}
