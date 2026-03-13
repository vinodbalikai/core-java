class Box{
	String brand;
	String type;
	String colour;
	int size;
	boolean isPlastic;
	String material;
	boolean hasLid;
	boolean isTransparent;
	String shape;
	int price;
	int weight;
	String usage;
	
	public Box(String brand, String type, String colour, String material, String shape, String usage){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.usage=usage;
	}
	public Box(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Box(boolean isPlastic,boolean hasLid,boolean isTransparent){
		this.isPlastic=isPlastic;
		this.hasLid=hasLid;
		this.isTransparent=isTransparent;
	}

}
