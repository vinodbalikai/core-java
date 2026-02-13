class Microwave{
	static Double getPrice(){
		System.out.println("Fetching the microwave price");
		return 12000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the microwave");
		return "IFB";
	}
	static int getCapacity(){
		System.out.println("Fetching capacity");
		return 25;
	}
	static String getType(){
		System.out.println("Getting microwave type");
		return "Convection";
	}
	static int getPowerConsumption(){
		System.out.println("Fetching power consumption");
		return 900;
	}
	static boolean hasAutoCookMenu(){
		System.out.println("Checking auto cook menu");
		return true;
	}
}
