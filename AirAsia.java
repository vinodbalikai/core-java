class AirAsia {
    String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger) {
        boolean isPassengerAdded = false;

        if (passenger != null && !passenger.isEmpty()) {
            passengers[index++] = passenger;
            isPassengerAdded = true;
        } else {
            System.out.println("Invalid passenger name");
        }
        return isPassengerAdded;
    }

    public void getPassengers() {
        System.out.println("The passengers are:");
        for (String person : passengers) {
            System.out.println(person);
        }
    }
}
