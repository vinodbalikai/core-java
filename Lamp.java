class Lamp{
	String brand;
	String type;
	String colour;
	int watt;
	boolean isLED;
	String material;
	boolean hasSwitch;
	boolean isRechargeable;
	String shape;
	int price;
	int weight;
	String lightType;
	
	public Lamp(String brand, String type, String colour, String material, String shape, String lightType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.lightType=lightType;
	}
	public Lamp(int watt,int price,int weight){
		this.watt=watt;
		this.price=price;
		this.weight=weight;
	}
	public Lamp(boolean isLED,boolean hasSwitch,boolean isRechargeable){
		this.isLED=isLED;
		this.hasSwitch=hasSwitch;
		this.isRechargeable=isRechargeable;
	}

}

