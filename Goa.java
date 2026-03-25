class Goa {
    String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beachName) {
        boolean isAdded = false;

        if (beachName != null && !beachName.isEmpty()) {
            beachNames[index++] = beachName;
            isAdded = true;
        } else {
            System.out.println("Invalid beach name");
        }
        return isAdded;
    }

    public void getBeachNames() {
        System.out.println("The beach names are:");
        for (String beach : beachNames) {
            System.out.println(beach);
        }
    }
}
