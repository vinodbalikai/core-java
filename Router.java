class Router{
	static Double getPrice(){
		System.out.println("Fetching the router price");
		return 3500.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the router");
		return "TP-Link";
	}
	static int getSpeed(){
		System.out.println("Fetching internet speed");
		return 300;
	}
	static int getNumberOfAntennas(){
		System.out.println("Getting number of antennas");
		return 4;
	}
	static String getFrequencyBand(){
		System.out.println("Fetching frequency band");
		return "Dual Band";
	}
	static boolean hasFirewall(){
		System.out.println("Checking firewall support");
		return true;
	}
}
