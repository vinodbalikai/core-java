class BluetoothSpeakerExecuter{
	public static void main(String [] speaker){
		Double price =BluetoothSpeaker.getPrice();
        System.out.println("The price of the speaker is: "+price);
		
		String brand=BluetoothSpeaker.getBrand();
		System.out.println("The brand of the speaker is: "+brand);
		
		int power=BluetoothSpeaker.getOutputPower();
		System.out.println("The output power is: "+power+"W");
		
		int battery=BluetoothSpeaker.getBatteryLife();
		System.out.println("The battery life is: "+battery+" hours");
		
		boolean waterproof=BluetoothSpeaker.isWaterproof();
		System.out.println("Is waterproof: "+waterproof);
		
		String connectivity=BluetoothSpeaker.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
	}
}