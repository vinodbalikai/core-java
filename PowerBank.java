class PowerBank{
	String brand;
	String type;
	String colour;
	int capacity;
	boolean isFastCharge;
	String material;
	boolean hasDisplay;
	boolean hasTorch;
	String shape;
	int price;
	int weight;
	String portType;
	
	public PowerBank(String brand, String type, String colour, String material, String shape, String portType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.portType=portType;
	}
	public PowerBank(int capacity,int price,int weight){
		this.capacity=capacity;
		this.price=price;
		this.weight=weight;
	}
	public PowerBank(boolean isFastCharge,boolean hasDisplay,boolean hasTorch){
		this.isFastCharge=isFastCharge;
		this.hasDisplay=hasDisplay;
		this.hasTorch=hasTorch;
	}

}
