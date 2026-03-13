class Anklet {
    int weight;
    String material;
    boolean hasGems;
    double diameterCm;
    String colour;
    int sizeInches;
    double price;
    String brand;

    Anklet() {
		
    }

    Anklet(int weight, String material, boolean hasGems, double diameterCm, String colour, int sizeInches, double price, String brand) {
        System.out.println("Parameterized constructor called");
        this.weight = weight;
        this.material = material;
        this.hasGems = hasGems;
        this.diameterCm = diameterCm;
        this.colour = colour;
        this.sizeInches = sizeInches;
        this.price = price;
        this.brand = brand;
    }
}
