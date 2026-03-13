class TubeLight{
	String brand;
	String type;
	String colour;
	int watt;
	boolean isLED;
	String material;
	boolean hasStarter;
	boolean isEnergySaving;
	String shape;
	int price;
	int weight;
	String lightType;
	
	public TubeLight(String brand, String type, String colour, String material, String shape, String lightType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.lightType=lightType;
	}
	public TubeLight(int watt,int price,int weight){
		this.watt=watt;
		this.price=price;
		this.weight=weight;
	}
	public TubeLight(boolean isLED,boolean hasStarter,boolean isEnergySaving){
		this.isLED=isLED;
		this.hasStarter=hasStarter;
		this.isEnergySaving=isEnergySaving;
	}

}
