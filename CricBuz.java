class CricBuz {
    String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String teamName) {
        boolean isTeamAdded = false;

        if (teamName != null && !teamName.isEmpty()) {
            teamNames[index++] = teamName;  // no length check
            isTeamAdded = true;
        } else {
            System.out.println("Invalid team name");
        }
        return isTeamAdded;
    }

    public void getTeamNames() {
        System.out.println("The team names are:");
        for (String team : teamNames) {
            System.out.println(team);
        }
    }
}
