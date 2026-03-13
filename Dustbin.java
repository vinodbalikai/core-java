class Dustbin{
	String brand;
	String type;
	String colour;
	int capacity;
	boolean isPlastic;
	String material;
	boolean hasLid;
	boolean hasPedal;
	String shape;
	int price;
	int weight;
	String usage;
	
	public Dustbin(String brand, String type, String colour, String material, String shape, String usage){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.shape=shape;
		this.usage=usage;
	}
	public Dustbin(int capacity,int price,int weight){
		this.capacity=capacity;
		this.price=price;
		this.weight=weight;
	}
	public Dustbin(boolean isPlastic,boolean hasLid,boolean hasPedal){
		this.isPlastic=isPlastic;
		this.hasLid=hasLid;
		this.hasPedal=hasPedal;
	}

}

