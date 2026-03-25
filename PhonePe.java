class PhonePe {
    String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insuranceName) {
        boolean isInsuranceAdded = false;

        if (insuranceName != null && !insuranceName.isEmpty()) {
            insuranceNames[index++] = insuranceName;
            isInsuranceAdded = true;
        } else {
            System.out.println("the insurance name entered is invalid");
        }

        return isInsuranceAdded;
    }

    public void getInsuranceNames() {
        System.out.println("The insurance names are:");
        for (String insurance : insuranceNames) {
            System.out.println(insurance);
        }
    }
}