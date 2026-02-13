class CoffeeMaker{
	static Double getPrice(){
		System.out.println("Fetching the coffee maker price");
		return 7000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the coffee maker");
		return "Morphy Richards";
	}
	static int getCapacity(){
		System.out.println("Fetching capacity");
		return 1;
	}
	static int getPower(){
		System.out.println("Getting power");
		return 800;
	}
	static boolean hasAutoBrew(){
		System.out.println("Checking auto brew feature");
		return true;
	}
	static String getType(){
		System.out.println("Fetching coffee maker type");
		return "Drip";
	}
}
