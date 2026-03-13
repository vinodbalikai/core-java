class Door{
	String brand;
	String type;
	String colour;
	int height;
	boolean isWooden;
	String material;
	boolean hasLock;
	boolean hasHandle;
	String design;
	int price;
	int weight;
	String finish;
	
	public Door(String brand, String type, String colour, String material, String design, String finish){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.finish=finish;
	}
	public Door(int height,int price,int weight){
		this.height=height;
		this.price=price;
		this.weight=weight;
	}
	public Door(boolean isWooden,boolean hasLock,boolean hasHandle){
		this.isWooden=isWooden;
		this.hasLock=hasLock;
		this.hasHandle=hasHandle;
	}

}
