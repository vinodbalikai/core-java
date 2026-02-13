class RefrigeratorExecuter{
	public static void main(String [] fridge){
		Double price =Refrigerator.getPrice();
        System.out.println("The price of the refrigerator is: "+price);
		
		String brand=Refrigerator.getBrand();
		System.out.println("The brand of the refrigerator is: "+brand);
		
		int capacity=Refrigerator.getCapacity();
		System.out.println("The capacity is: "+capacity+" Litres");
		
		String rating=Refrigerator.getEnergyRating();
		System.out.println("The energy rating is: "+rating);
		
		String door=Refrigerator.getDoorType();
		System.out.println("The door type is: "+door);
		
		boolean inverter=Refrigerator.hasInverterTechnology();
		System.out.println("Has inverter technology: "+inverter);
	}
}