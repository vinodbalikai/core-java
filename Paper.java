class Paper{
	String brand;
	String type;
	String colour;
	int size;
	boolean isA4;
	String material;
	boolean isRecycled;
	boolean isGlossy;
	String usage;
	int price;
	int quantity;
	String packType;
	
	public Paper(String brand, String type, String colour, String material, String usage, String packType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.usage=usage;
		this.packType=packType;
	}
	public Paper(int size,int price,int quantity){
		this.size=size;
		this.price=price;
		this.quantity=quantity;
	}
	public Paper(boolean isA4,boolean isRecycled,boolean isGlossy){
		this.isA4=isA4;
		this.isRecycled=isRecycled;
		this.isGlossy=isGlossy;
	}

}

