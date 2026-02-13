class ElectricKettleExecuter{
	public static void main(String [] kettle){
		Double price =ElectricKettle.getPrice();
        System.out.println("The price of the electric kettle is: "+price);
		
		String brand=ElectricKettle.getBrand();
		System.out.println("The brand of the electric kettle is: "+brand);
		
		int capacity=ElectricKettle.getCapacity();
		System.out.println("Capacity: "+capacity+" Litres");
		
		int power=ElectricKettle.getPower();
		System.out.println("Power: "+power+"W");
		
		boolean cut=ElectricKettle.hasAutoCutOff();
		System.out.println("Has auto cut off: "+cut);
		
		String material=ElectricKettle.getMaterial();
		System.out.println("Material: "+material);
	}
}