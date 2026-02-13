class SmartBulb{
	static Double getPrice(){
		System.out.println("Fetching the smart bulb price");
		return 999.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the smart bulb");
		return "Philips";
	}
	static int getWattage(){
		System.out.println("Fetching wattage");
		return 9;
	}
	static String getLightColor(){
		System.out.println("Getting light color");
		return "RGB";
	}
	static boolean supportsVoiceControl(){
		System.out.println("Checking voice control support");
		return true;
	}
	static String getConnectivity(){
		System.out.println("Fetching connectivity");
		return "WiFi";
	}
}
