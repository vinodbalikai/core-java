class Bike{
	String brand;
	String type;
	String colour;
	int weight;
	boolean isTuned;
	String cc;
	boolean hasABS;
	boolean hasTC;
	String topSpeed;
	int bhp;
	int torque;
	String light;
	
	public Bike(String brand, String type, String colour, String cc, String topSpeed, String light){
		this.brand=brand;
		this.type=type;
		this.colour=colour;
		this.cc=cc;
		this.topSpeed=topSpeed;
		this.light=light;
	}
	public Bike(int weight,int bhp,int torque){
		this.weight=weight;
		this.bhp=bhp;
		this.torque=torque;
	}
	public Bike(boolean isTuned,boolean hasABS,boolean hasTC){
		this.isTuned=isTuned;
		this.hasABS=hasABS;
		this.hasTC=hasTC;
	}

}