class CoffeeMakerExecuter{
	public static void main(String [] coffee){
		Double price =CoffeeMaker.getPrice();
        System.out.println("The price of the coffee maker is: "+price);
		
		String brand=CoffeeMaker.getBrand();
		System.out.println("The brand of the coffee maker is: "+brand);
		
		int capacity=CoffeeMaker.getCapacity();
		System.out.println("Capacity: "+capacity+" Litres");
		
		int power=CoffeeMaker.getPower();
		System.out.println("Power: "+power+"W");
		
		boolean brew=CoffeeMaker.hasAutoBrew();
		System.out.println("Has auto brew: "+brew);
		
		String type=CoffeeMaker.getType();
		System.out.println("Type: "+type);
	}
}