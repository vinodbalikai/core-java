class ElectricalShop {
    String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isApplianceAdded = false;

        if (appliance != null && !appliance.isEmpty()) {
            appliances[index++] = appliance;
            isApplianceAdded = true;
        } else {
            System.out.println("Invalid appliance name");
        }
        return isApplianceAdded;
    }

    public void getAppliances() {
        System.out.println("The appliances are:");
        for (String item : appliances) {
            System.out.println(item);
        }
    }
}
