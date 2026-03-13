class Chain{
	String brand;
	String type;
	String colour;
	int length;
	boolean isGold;
	String material;
	boolean hasPendant;
	boolean isThick;
	String design;
	int price;
	int weight;
	String style;
	
	public Chain(String brand, String type, String colour, String material, String design, String style){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.style=style;
	}
	public Chain(int length,int price,int weight){
		this.length=length;
		this.price=price;
		this.weight=weight;
	}
	public Chain(boolean isGold,boolean hasPendant,boolean isThick){
		this.isGold=isGold;
		this.hasPendant=hasPendant;
		this.isThick=isThick;
	}

}
