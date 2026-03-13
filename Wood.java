class Wood{
	String brand;
	String type;
	String colour;
	int length;
	boolean isHardwood;
	String origin;
	boolean isPolished;
	boolean isWaterResistant;
	String grainType;
	int price;
	int weight;
	String finish;
	
	public Wood(String brand, String type, String colour, String origin, String grainType, String finish){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.origin=origin;
		this.grainType=grainType;
		this.finish=finish;
	}
	public Wood(int length,int price,int weight){
		this.length=length;
		this.price=price;
		this.weight=weight;
	}
	public Wood(boolean isHardwood,boolean isPolished,boolean isWaterResistant){
		this.isHardwood=isHardwood;
		this.isPolished=isPolished;
		this.isWaterResistant=isWaterResistant;
	}

}
