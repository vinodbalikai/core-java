class RCB {
    String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String playerName) {
        boolean isPlayerAdded = false;

        if (playerName != null && !playerName.isEmpty()) {
            playerNames[index++] = playerName;
            isPlayerAdded = true;
        } else {
            System.out.println("Invalid player name");
        }
        return isPlayerAdded;
    }

    public void getPlayerNames() {
        System.out.println("The player names are:");
        for (String player : playerNames) {
            System.out.println(player);
        }
    }
}
