class SmartLock{
	static Double getPrice(){
		System.out.println("Fetching the smart lock price");
		return 15000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the smart lock");
		return "Godrej";
	}
	static String getUnlockMethod(){
		System.out.println("Fetching unlock method");
		return "Fingerprint";
	}
	static boolean hasAutoLock(){
		System.out.println("Checking auto lock feature");
		return true;
	}
	static String getConnectivity(){
		System.out.println("Getting connectivity");
		return "Bluetooth";
	}
	static int getBatteryLife(){
		System.out.println("Fetching battery life");
		return 12;
	}
}

