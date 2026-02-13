class BluetoothSpeaker{
	static Double getPrice(){
		System.out.println("Fetching the speaker price");
		return 4999.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the speaker");
		return "JBL";
	}
	static int getOutputPower(){
		System.out.println("Fetching output power");
		return 20;
	}
	static int getBatteryLife(){
		System.out.println("Getting battery life");
		return 12;
	}
	static boolean isWaterproof(){
		System.out.println("Checking waterproof feature");
		return true;
	}
	static String getConnectivity(){
		System.out.println("Fetching connectivity");
		return "Bluetooth";
	}
}
