class AirConditioner{
	static Double getPrice(){
		System.out.println("Fetching the AC price");
		return 35000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the AC");
		return "Voltas";
	}
	static int getCoolingCapacity(){
		System.out.println("Fetching cooling capacity");
		return 1;
	}
	static String getEnergyRating(){
		System.out.println("Getting energy rating");
		return "3 Star";
	}
	static String getType(){
		System.out.println("Fetching AC type");
		return "Split AC";
	}
	static boolean hasInverter(){
		System.out.println("Checking inverter feature");
		return true;
	}
}

