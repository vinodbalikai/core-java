package com.ipl.teamapp.team;

public class Team {
    private int teamId;
    private String teamName;
    private String teamState;

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamState() {
        return teamState;
    }
}
