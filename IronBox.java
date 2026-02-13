class IronBox{
	static Double getPrice(){
		System.out.println("Fetching the iron box price");
		return 1500.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the iron box");
		return "Philips";
	}
	static int getPower(){
		System.out.println("Fetching power");
		return 1000;
	}
	static String getSoleplateType(){
		System.out.println("Getting soleplate type");
		return "Ceramic";
	}
	static boolean hasSteamFeature(){
		System.out.println("Checking steam feature");
		return true;
	}
	static boolean hasAutoShutOff(){
		System.out.println("Checking auto shut off");
		return true;
	}
}
