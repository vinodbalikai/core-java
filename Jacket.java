class Jacket{
	String brand;
	String type;
	String colour;
	int size;
	boolean isWaterproof;
	String material;
	boolean hasHood;
	boolean hasZip;
	String style;
	int price;
	int weight;
	String season;
	
	public Jacket(String brand, String type, String colour, String material, String style, String season){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.style=style;
		this.season=season;
	}
	public Jacket(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Jacket(boolean isWaterproof,boolean hasHood,boolean hasZip){
		this.isWaterproof=isWaterproof;
		this.hasHood=hasHood;
		this.hasZip=hasZip;
	}

}
