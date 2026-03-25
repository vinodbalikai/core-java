class Wonderla {
    String waterGames[] = new String[22];
    int index;

    public boolean addWaterGame(String gameName) {
        boolean isGameAdded = false;

        if (gameName != null && !gameName.isEmpty()) {
            waterGames[index++] = gameName;
            isGameAdded = true;
        } else {
            System.out.println("the game name entered is invalid");
        }

        return isGameAdded;
    }

    public void getWaterGames() {
        System.out.println("The water games are:");
        for (String game : waterGames) {
            System.out.println(game);
        }
    }
}