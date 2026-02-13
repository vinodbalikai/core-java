class SmartBulbExecuter{
	public static void main(String [] bulb){
		Double price =SmartBulb.getPrice();
        System.out.println("The price of the smart bulb is: "+price);
		
		String brand=SmartBulb.getBrand();
		System.out.println("The brand of the smart bulb is: "+brand);
		
		int watt=SmartBulb.getWattage();
		System.out.println("The wattage is: "+watt+"W");
		
		String color=SmartBulb.getLightColor();
		System.out.println("The light color is: "+color);
		
		boolean voice=SmartBulb.supportsVoiceControl();
		System.out.println("Supports voice control: "+voice);
		
		String connectivity=SmartBulb.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
	}
}