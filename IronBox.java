class IronBox{
	String brand;
	String type;
	String colour;
	int watt;
	boolean isSteam;
	String material;
	boolean hasTempControl;
	boolean isNonStick;
	String plateType;
	int price;
	int weight;
	String cordType;
	
	public IronBox(String brand, String type, String colour, String material, String plateType, String cordType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.plateType=plateType;
		this.cordType=cordType;
	}
	public IronBox(int watt,int price,int weight){
		this.watt=watt;
		this.price=price;
		this.weight=weight;
	}
	public IronBox(boolean isSteam,boolean hasTempControl,boolean isNonStick){
		this.isSteam=isSteam;
		this.hasTempControl=hasTempControl;
		this.isNonStick=isNonStick;
	}

}

