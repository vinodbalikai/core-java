class Soap{
	String brand;
	String type;
	String colour;
	int weight;
	boolean isHerbal;
	String fragrance;
	boolean hasMoisturizer;
	boolean isAntibacterial;
	String shape;
	int price;
	int quantity;
	String packType;
	
	public Soap(String brand, String type, String colour, String fragrance, String shape, String packType){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.fragrance=fragrance;
		this.shape=shape;
		this.packType=packType;
	}
	public Soap(int weight,int price,int quantity){
		this.weight=weight;
		this.price=price;
		this.quantity=quantity;
	}
	public Soap(boolean isHerbal,boolean hasMoisturizer,boolean isAntibacterial){
		this.isHerbal=isHerbal;
		this.hasMoisturizer=hasMoisturizer;
		this.isAntibacterial=isAntibacterial;
	}

}
