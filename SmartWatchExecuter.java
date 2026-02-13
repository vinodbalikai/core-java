class SmartWatchExecuter{
	public static void main(String [] watch){
		Double price =SmartWatch.getPrice();
        System.out.println("The price of the watch is: "+price);
		
		String brand=SmartWatch.getBrand();
		System.out.println("The Brand of the watch is: "+brand);
		
		String system=SmartWatch.getOperatingSystem();
		System.out.println("The operating system of the watch is: "+system);
		
		String material=SmartWatch.getMaterialType();
		System.out.println("The material of the watch is: "+material);
		
		String connectivity=SmartWatch.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
		
		int battery=SmartWatch.getBatteryPower();
		System.out.println("The battery power is: "+battery);
		
	}
}