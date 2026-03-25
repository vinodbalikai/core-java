class Gym {
    String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipmentName) {
        boolean isEquipmentAdded = false;

        if (equipmentName != null && !equipmentName.isEmpty()) {
            equipments[index++] = equipmentName;
            isEquipmentAdded = true;
        } else {
            System.out.println("the equipment name entered is invalid");
        }

        return isEquipmentAdded;
    }

    public void getEquipments() {
        System.out.println("The gym equipments are:");
        for (String equipment : equipments) {
            System.out.println(equipment);
        }
    }
}