class Printer{
	static Double getPrice(){
		System.out.println("Fetching the printer price");
		return 15000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the printer");
		return "HP";
	}
	static String getPrintType(){
		System.out.println("Fetching print type");
		return "Laser";
	}
	static int getPrintSpeed(){
		System.out.println("Getting print speed");
		return 20;
	}
	static boolean hasWifi(){
		System.out.println("Checking WiFi feature");
		return true;
	}
	static String getColorSupport(){
		System.out.println("Fetching color support");
		return "Color";
	}
}
