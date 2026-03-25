class PetShop {
    String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (accessory != null && !accessory.isEmpty()) {
            petAccessories[index++] = accessory;
            isAdded = true;
        } else {
            System.out.println("Invalid accessory name");
        }
        return isAdded;
    }

    public void getAccessories() {
        System.out.println("The pet accessories are:");
        for (String item : petAccessories) {
            System.out.println(item);
        }
    }
}
