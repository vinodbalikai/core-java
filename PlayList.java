class PlayList {
    String songNames[] = new String[15];
    int index;

    public boolean addSong(String songName) {
        boolean isSongAdded = false;

        if (songName != null && !songName.isEmpty()) {
            songNames[index++] = songName;
            isSongAdded = true;
        } else {
            System.out.println("the song name entered is invalid");
        }

        return isSongAdded;
    }

    public void getSongNames() {
        System.out.println("The song names are:");
        for (String song : songNames) {
            System.out.println(song);
        }
    }
}