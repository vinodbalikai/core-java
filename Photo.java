class Photo{
	String brand;
	String type;
	String colour;
	int size;
	boolean isFramed;
	String material;
	boolean isPrinted;
	boolean isGlossy;
	String theme;
	int price;
	int weight;
	String shape;
	
	public Photo(String brand, String type, String colour, String material, String theme, String shape){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.theme=theme;
		this.shape=shape;
	}
	public Photo(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Photo(boolean isFramed,boolean isPrinted,boolean isGlossy){
		this.isFramed=isFramed;
		this.isPrinted=isPrinted;
		this.isGlossy=isGlossy;
	}

}
