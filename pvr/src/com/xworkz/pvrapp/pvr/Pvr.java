package com.xworkz.pvrapp.pvr;

import com.xworkz.pvrapp.screen.Screen;

public class Pvr {
    Screen screen;
    public boolean addScreen(Screen screen){
        boolean isScreenAdded=false;
        boolean isScreenValid=false;
        boolean isScreenNoValid=false;
        boolean isScreenTypeValid=false;

        if(screen.getScreenId()>0)isScreenValid=true;
        if(screen.getScreenNo()>0)isScreenNoValid=true;
        if(screen.getScreenType()!=null)isScreenTypeValid=true;

        if(isScreenValid&&isScreenNoValid&&isScreenTypeValid){
            isScreenAdded=true;
            this.screen=screen;
        }
        return isScreenAdded;
    }

    public void getScreenDetails(){
        System.out.println("The Screen Id is: "+screen.getScreenId());
        System.out.println("The Screen No is: "+screen.getScreenNo());
        System.out.println("The Screen type is: "+screen.getScreenType());
    }
}
