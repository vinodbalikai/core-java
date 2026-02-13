class AirPurifier{
	static Double getPrice(){
		System.out.println("Fetching the air purifier price");
		return 14000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the air purifier");
		return "Dyson";
	}
	static int getCoverageArea(){
		System.out.println("Fetching coverage area");
		return 400;
	}
	static String getFilterType(){
		System.out.println("Getting filter type");
		return "HEPA";
	}
	static int getNoiseLevel(){
		System.out.println("Fetching noise level");
		return 35;
	}
	static boolean hasAirQualityIndicator(){
		System.out.println("Checking air quality indicator");
		return true;
	}
}
