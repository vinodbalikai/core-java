class AirConditionerExecuter{
	public static void main(String [] ac){
		Double price =AirConditioner.getPrice();
        System.out.println("The price of the AC is: "+price);
		
		String brand=AirConditioner.getBrand();
		System.out.println("The brand of the AC is: "+brand);
		
		int capacity=AirConditioner.getCoolingCapacity();
		System.out.println("The cooling capacity is: "+capacity+" Ton");
		
		String rating=AirConditioner.getEnergyRating();
		System.out.println("The energy rating is: "+rating);
		
		String type=AirConditioner.getType();
		System.out.println("The type of AC is: "+type);
		
		boolean inverter=AirConditioner.hasInverter();
		System.out.println("Has inverter: "+inverter);
	}
}