class MicrowaveExecuter{
	public static void main(String [] micro){
		Double price =Microwave.getPrice();
        System.out.println("The price of the microwave is: "+price);
		
		String brand=Microwave.getBrand();
		System.out.println("The brand of the microwave is: "+brand);
		
		int capacity=Microwave.getCapacity();
		System.out.println("The capacity is: "+capacity+" Litres");
		
		String type=Microwave.getType();
		System.out.println("The microwave type is: "+type);
		
		int power=Microwave.getPowerConsumption();
		System.out.println("The power consumption is: "+power+" Watts");
		
		boolean auto=Microwave.hasAutoCookMenu();
		System.out.println("Has auto cook menu: "+auto);
	}
}