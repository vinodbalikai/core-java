class WashingMachineExecuter{
	public static void main(String [] wash){
		Double price =WashingMachine.getPrice();
        System.out.println("The price of the washing machine is: "+price);
		
		String brand=WashingMachine.getBrand();
		System.out.println("The brand of the washing machine is: "+brand);
		
		int capacity=WashingMachine.getWashCapacity();
		System.out.println("The wash capacity is: "+capacity+" KG");
		
		String load=WashingMachine.getLoadType();
		System.out.println("The load type is: "+load);
		
		int speed=WashingMachine.getSpinSpeed();
		System.out.println("The spin speed is: "+speed+" RPM");
		
		boolean heater=WashingMachine.hasHeater();
		System.out.println("Has heater: "+heater);
	}
}