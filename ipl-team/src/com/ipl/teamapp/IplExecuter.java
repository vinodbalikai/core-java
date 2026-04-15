package com.ipl.teamapp;

import com.ipl.teamapp.ipl.Ipl;
import com.ipl.teamapp.team.Team;

public class IplExecuter {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Ipl ipl=new Ipl();
        Team team=new Team();
        team.setTeamId(17);
        team.setTeamName("RCB");
        team.setTeamState("KARNATAKA");

        boolean isTeamCreated=ipl.creatTeam(team);
        System.out.println("The Ipl Team created: "+isTeamCreated);

        ipl.getTeamDetails();
        System.out.println("Main Ended");
    }
}
