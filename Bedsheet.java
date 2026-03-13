class Bedsheet{
	String brand;
	String type;
	String colour;
	int size;
	boolean isCotton;
	String material;
	boolean hasPrint;
	boolean isDoubleBed;
	String design;
	int price;
	int weight;
	String pattern;
	
	public Bedsheet(String brand, String type, String colour, String material, String design, String pattern){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.pattern=pattern;
	}
	public Bedsheet(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Bedsheet(boolean isCotton,boolean hasPrint,boolean isDoubleBed){
		this.isCotton=isCotton;
		this.hasPrint=hasPrint;
		this.isDoubleBed=isDoubleBed;
	}

}
