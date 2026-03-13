class Crocs{
	String brand;
	String type;
	String colour;
	int size;
	boolean isWaterproof;
	String material;
	boolean hasStrap;
	boolean hasVentilation;
	String soleType;
	int price;
	int weight;
	String pattern;
	
	public Crocs(String brand, String type, String colour, String material, String soleType, String pattern){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.soleType=soleType;
		this.pattern=pattern;
	}
	public Crocs(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Crocs(boolean isWaterproof,boolean hasStrap,boolean hasVentilation){
		this.isWaterproof=isWaterproof;
		this.hasStrap=hasStrap;
		this.hasVentilation=hasVentilation;
	}

}
