class Shampoo{
	String brand;
	String type;
	String colour;
	int quantity;
	boolean isHerbal;
	String fragrance;
	boolean hasConditioner;
	boolean isAntiDandruff;
	String hairType;
	int price;
	int weight;
	String container;
	
	public Shampoo(String brand, String type, String colour, String fragrance, String hairType, String container){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.fragrance=fragrance;
		this.hairType=hairType;
		this.container=container;
	}
	public Shampoo(int quantity,int price,int weight){
		this.quantity=quantity;
		this.price=price;
		this.weight=weight;
	}
	public Shampoo(boolean isHerbal,boolean hasConditioner,boolean isAntiDandruff){
		this.isHerbal=isHerbal;
		this.hasConditioner=hasConditioner;
		this.isAntiDandruff=isAntiDandruff;
	}

}
