class VacuumCleaner{
	static Double getPrice(){
		System.out.println("Fetching the vacuum cleaner price");
		return 9000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the vacuum cleaner");
		return "Eureka Forbes";
	}
	static int getPower(){
		System.out.println("Fetching power");
		return 1200;
	}
	static String getType(){
		System.out.println("Getting cleaner type");
		return "Dry";
	}
	static int getDustCapacity(){
		System.out.println("Fetching dust capacity");
		return 2;
	}
	static boolean hasHEPAFilter(){
		System.out.println("Checking HEPA filter");
		return true;
	}
}
