class Camera{
	static Double getPrice(){
		System.out.println("Fetching the camera price");
		return 55000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the camera");
		return "Canon";
	}
	static int getMegapixels(){
		System.out.println("Fetching megapixels");
		return 24;
	}
	static String getLensType(){
		System.out.println("Getting lens type");
		return "Wide Angle";
	}
	static String getVideoQuality(){
		System.out.println("Fetching video quality");
		return "4K";
	}
	static boolean hasFlash(){
		System.out.println("Checking flash availability");
		return true;
	}
}
