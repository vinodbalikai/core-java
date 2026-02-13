class Fan{
	static Double getPrice(){
		System.out.println("Fetching the fan price");
		return 3000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the fan");
		return "Usha";
	}
	static int getSpeedLevels(){
		System.out.println("Fetching speed levels");
		return 5;
	}
	static String getType(){
		System.out.println("Getting fan type");
		return "Ceiling Fan";
	}
	static int getPowerConsumption(){
		System.out.println("Fetching power consumption");
		return 75;
	}
	static boolean hasRemote(){
		System.out.println("Checking remote feature");
		return false;
	}
}
