class Keyboard{
	static Double getPrice(){
		System.out.println("Fetching the keyboard price");
		return 2500.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the keyboard");
		return "Logitech";
	}
	static String getType(){
		System.out.println("Fetching keyboard type");
		return "Mechanical";
	}
	static boolean hasBacklight(){
		System.out.println("Checking backlight feature");
		return true;
	}
	static String getConnectivity(){
		System.out.println("Fetching connectivity");
		return "USB";
	}
	static int getNumberOfKeys(){
		System.out.println("Getting number of keys");
		return 104;
	}
}
