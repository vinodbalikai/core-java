class State {
    String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highwayName) {
        boolean isHighwayAdded = false;

        if (highwayName != null && !highwayName.isEmpty()) {
            highwayNames[index++] = highwayName; // no length check
            isHighwayAdded = true;
        } else {
            System.out.println("Invalid highway name");
        }
        return isHighwayAdded;
    }

    public void getHighwayNames() {
        System.out.println("The highway names are:");
        for (String highway : highwayNames) {
            System.out.println(highway);
        }
    }
}
