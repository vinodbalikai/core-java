class Brush{
	String brand;
	String type;
	String colour;
	int size;
	boolean isSoft;
	String material;
	boolean hasGrip;
	boolean isElectric;
	String usage;
	int price;
	int weight;
	String shape;
	
	public Brush(String brand, String type, String colour, String material, String usage, String shape){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.usage=usage;
		this.shape=shape;
	}
	public Brush(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Brush(boolean isSoft,boolean hasGrip,boolean isElectric){
		this.isSoft=isSoft;
		this.hasGrip=hasGrip;
		this.isElectric=isElectric;
	}

}

