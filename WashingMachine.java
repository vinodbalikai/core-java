class WashingMachine{
	static Double getPrice(){
		System.out.println("Fetching the washing machine price");
		return 18000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the washing machine");
		return "Samsung";
	}
	static int getWashCapacity(){
		System.out.println("Fetching wash capacity");
		return 7;
	}
	static String getLoadType(){
		System.out.println("Getting load type");
		return "Front Load";
	}
	static int getSpinSpeed(){
		System.out.println("Fetching spin speed");
		return 1200;
	}
	static boolean hasHeater(){
		System.out.println("Checking heater availability");
		return true;
	}
}
