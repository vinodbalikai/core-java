class Magnet{
	String brand;
	String type;
	String colour;
	int strength;
	boolean isPermanent;
	String material;
	boolean isFlexible;
	boolean isIndustrial;
	String shape;
	int price;
	int weight;
	String coating;
	
	public Magnet(String brand, String type, String colour, String material, String shape, String coating){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.coating=coating;
	}
	public Magnet(int strength,int price,int weight){
		this.strength=strength;
		this.price=price;
		this.weight=weight;
	}
	public Magnet(boolean isPermanent,boolean isFlexible,boolean isIndustrial){
		this.isPermanent=isPermanent;
		this.isFlexible=isFlexible;
		this.isIndustrial=isIndustrial;
	}

}
