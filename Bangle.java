class Bangle
{
    int size;
    String material;
    String colour;
    double weight;
    double price;
    boolean hasDesign;
    String brand;
    String type;

    Bangle()
    {
    }

    Bangle(int size,String material,String colour,double weight,double price,boolean hasDesign,String brand,String type)
    {
        System.out.println("Parameterized constructor called...");
        this.size = size;
        this.material = material;
        this.colour = colour;
        this.weight = weight;
        this.price = price;
        this.hasDesign = hasDesign;
        this.brand = brand;
        this.type = type;
    }
}