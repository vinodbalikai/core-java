class Pillow{
	String brand;
	String type;
	String colour;
	int size;
	boolean isSoft;
	String material;
	boolean hasCover;
	boolean isWashable;
	String shape;
	int price;
	int weight;
	String filling;
	
	public Pillow(String brand, String type, String colour, String material, String shape, String filling){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.filling=filling;
	}
	public Pillow(int size,int price,int weight){
		this.size=size;
		this.price=price;
		this.weight=weight;
	}
	public Pillow(boolean isSoft,boolean hasCover,boolean isWashable){
		this.isSoft=isSoft;
		this.hasCover=hasCover;
		this.isWashable=isWashable;
	}

}
