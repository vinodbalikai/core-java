class Window{
	String brand;
	String type;
	String colour;
	int height;
	boolean isSliding;
	String material;
	boolean hasGlass;
	boolean hasGrill;
	String design;
	int price;
	int weight;
	String shape;
	
	public Window(String brand, String type, String colour, String material, String design, String shape){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.shape=shape;
	}
	public Window(int height,int price,int weight){
		this.height=height;
		this.price=price;
		this.weight=weight;
	}
	public Window(boolean isSliding,boolean hasGlass,boolean hasGrill){
		this.isSliding=isSliding;
		this.hasGlass=hasGlass;
		this.hasGrill=hasGrill;
	}

}

