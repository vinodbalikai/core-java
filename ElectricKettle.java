class ElectricKettle{
	static Double getPrice(){
		System.out.println("Fetching the electric kettle price");
		return 1800.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the electric kettle");
		return "Havells";
	}
	static int getCapacity(){
		System.out.println("Fetching capacity");
		return 2;
	}
	static int getPower(){
		System.out.println("Getting power");
		return 1500;
	}
	static boolean hasAutoCutOff(){
		System.out.println("Checking auto cut off");
		return true;
	}
	static String getMaterial(){
		System.out.println("Fetching material");
		return "Steel";
	}
}
