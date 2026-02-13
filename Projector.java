class Projector{
	static Double getPrice(){
		System.out.println("Fetching the projector price");
		return 30000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the projector");
		return "Epson";
	}
	static int getBrightness(){
		System.out.println("Fetching brightness");
		return 3500;
	}
	static String getResolution(){
		System.out.println("Getting resolution");
		return "HD";
	}
	static String getLampType(){
		System.out.println("Fetching lamp type");
		return "LED";
	}
	static boolean supportsHDMI(){
		System.out.println("Checking HDMI support");
		return true;
	}
}
