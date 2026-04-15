package com.ipl.teamapp.ipl;

import com.ipl.teamapp.team.Team;

public class Ipl {
    Team team;

    public boolean creatTeam(Team team){
        boolean isTeamCreated=false;
        boolean isTeamIdValid=false;
        boolean isTeamNameValid=false;
        boolean isTeamStateValid=false;

        if(team.getTeamId()>0)isTeamIdValid=true;
        if(team.getTeamName()!=null)isTeamNameValid=true;
        if(team.getTeamState()!=null)isTeamStateValid=true;

        if(isTeamIdValid&&isTeamNameValid&&isTeamStateValid){
            isTeamCreated=true;
            this.team=team;
        }
        return isTeamCreated;
    }

    public void getTeamDetails(){
        System.out.println("The team id is: "+team.getTeamId());
        System.out.println("The team name is: "+team.getTeamName());
        System.out.println("The team state is: "+team.getTeamState());
    }
}
