class SwitchBoard{
	String brand;
	String type;
	String colour;
	int switches;
	boolean hasIndicator;
	String material;
	boolean isModular;
	boolean hasSocket;
	String design;
	int price;
	int weight;
	String shape;
	
	public SwitchBoard(String brand, String type, String colour, String material, String design, String shape){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.shape=shape;
	}
	public SwitchBoard(int switches,int price,int weight){
		this.switches=switches;
		this.price=price;
		this.weight=weight;
	}
	public SwitchBoard(boolean hasIndicator,boolean isModular,boolean hasSocket){
		this.hasIndicator=hasIndicator;
		this.isModular=isModular;
		this.hasSocket=hasSocket;
	}

}
