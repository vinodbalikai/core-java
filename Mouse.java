class Mouse{
	static Double getPrice(){
		System.out.println("Fetching the mouse price");
		return 1200.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the mouse");
		return "Dell";
	}
	static String getType(){
		System.out.println("Fetching mouse type");
		return "Optical";
	}
	static String getConnectivity(){
		System.out.println("Getting connectivity");
		return "Wireless";
	}
	static int getDPI(){
		System.out.println("Fetching DPI value");
		return 1600;
	}
	static boolean hasScrollWheel(){
		System.out.println("Checking scroll wheel");
		return true;
	}
}
