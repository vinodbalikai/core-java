class Architect {
    String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String designName) {
        boolean isDesignAdded = false;

        if (designName != null && !designName.isEmpty()) {
            interiorDesignNames[index++] = designName;
            isDesignAdded = true;
        } else {
            System.out.println("Invalid design name");
        }
        return isDesignAdded;
    }

    public void getDesigns() {
        System.out.println("The interior design names are:");
        for (String design : interiorDesignNames) {
            System.out.println(design);
        }
    }
}
