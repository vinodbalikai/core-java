class PowerBank{
	static Double getPrice(){
		System.out.println("Fetching the power bank price");
		return 1999.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the power bank");
		return "Mi";
	}
	static int getCapacity(){
		System.out.println("Fetching battery capacity");
		return 20000;
	}
	static int getOutputPorts(){
		System.out.println("Getting number of output ports");
		return 2;
	}
	static boolean hasFastCharging(){
		System.out.println("Checking fast charging");
		return true;
	}
	static String getColor(){
		System.out.println("Fetching color");
		return "White";
	}
}
