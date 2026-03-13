class Stairs{
	String brand;
	String type;
	String colour;
	int steps;
	boolean isSteel;
	String material;
	boolean hasRailing;
	boolean isSpiral;
	String design;
	int height;
	int weight;
	String finish;
	
	public Stairs(String brand, String type, String colour, String material, String design, String finish){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.material=material;
		this.design=design;
		this.finish=finish;
	}
	public Stairs(int steps,int height,int weight){
		this.steps=steps;
		this.height=height;
		this.weight=weight;
	}
	public Stairs(boolean isSteel,boolean hasRailing,boolean isSpiral){
		this.isSteel=isSteel;
		this.hasRailing=hasRailing;
		this.isSpiral=isSpiral;
	}

}
