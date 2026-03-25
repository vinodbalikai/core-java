class Museum {
    String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monument) {
        boolean isAdded = false;

        if (monument != null && !monument.isEmpty()) {
            historicalMonuments[index++] = monument;
            isAdded = true;
        } else {
            System.out.println("Invalid monument name");
        }
        return isAdded;
    }

    public void getMonuments() {
        System.out.println("The historical monuments are:");
        for (String m : historicalMonuments) {
            System.out.println(m);
        }
    }
}
