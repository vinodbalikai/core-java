class WaterPurifierExecuter{
	public static void main(String [] water){
		Double price =WaterPurifier.getPrice();
        System.out.println("The price of the water purifier is: "+price);
		
		String brand=WaterPurifier.getBrand();
		System.out.println("The brand of the water purifier is: "+brand);
		
		String type=WaterPurifier.getPurificationType();
		System.out.println("Purification type: "+type);
		
		int capacity=WaterPurifier.getCapacity();
		System.out.println("Capacity: "+capacity+" Litres");
		
		boolean indicator=WaterPurifier.hasFilterIndicator();
		System.out.println("Has filter indicator: "+indicator);
		
		String mount=WaterPurifier.getMountType();
		System.out.println("Mount type: "+mount);
	}
}