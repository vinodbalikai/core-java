class Ring{
	String brand;
	String type;
	String colour;
	int size;
	boolean isGold;
	String material;
	boolean hasStone;
	boolean isAdjustable;
	String design;
	int price;
	int weight;
	String shape;
	
	public Ring(String brand, String type, String colour, String material, String design, String shape){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.shape=shape;
	}
	public Ring(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Ring(boolean isGold,boolean hasStone,boolean isAdjustable){
		this.isGold=isGold;
		this.hasStone=hasStone;
		this.isAdjustable=isAdjustable;
	}

}
