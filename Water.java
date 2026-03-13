class Water{
	String brand;
	String type;
	String colour;
	int quantity;
	boolean isDrinkable;
	String source;
	boolean isFiltered;
	boolean hasMinerals;
	String taste;
	int phLevel;
	int temperature;
	String container;
	
	public Water(String type, String colour, String source, String taste, String container){
		this.type=type;
		this.colour=colour;
		this.source=source;
		this.taste=taste;
		this.container=container;
	}
	public Water(int quantity,String brand,boolean isDrinkable){
		this.quantity=quantity;
		this.brand=brand;
		this.isDrinkable=isDrinkable;
	}
	public Water(int phLevel,int temperature){
		this.phLevel=phLevel;
		this.temperature=temperature;
	}
	public Water(boolean isFiltered,boolean hasMinerals){
		this.isFiltered=isFiltered;
		this.hasMinerals=hasMinerals;
	}

}
