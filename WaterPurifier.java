class WaterPurifier{
	static Double getPrice(){
		System.out.println("Fetching the water purifier price");
		return 12000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the water purifier");
		return "Kent";
	}
	static String getPurificationType(){
		System.out.println("Fetching purification type");
		return "RO+UV";
	}
	static int getCapacity(){
		System.out.println("Getting capacity");
		return 8;
	}
	static boolean hasFilterIndicator(){
		System.out.println("Checking filter indicator");
		return true;
	}
	static String getMountType(){
		System.out.println("Fetching mount type");
		return "Wall Mount";
	}
}
