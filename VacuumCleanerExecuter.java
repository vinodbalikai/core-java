class VacuumCleanerExecuter{
	public static void main(String [] clean){
		Double price =VacuumCleaner.getPrice();
        System.out.println("The price of the vacuum cleaner is: "+price);
		
		String brand=VacuumCleaner.getBrand();
		System.out.println("The brand of the vacuum cleaner is: "+brand);
		
		int power=VacuumCleaner.getPower();
		System.out.println("Power: "+power+"W");
		
		String type=VacuumCleaner.getType();
		System.out.println("Type: "+type);
		
		int dust=VacuumCleaner.getDustCapacity();
		System.out.println("Dust capacity: "+dust+" Litres");
		
		boolean filter=VacuumCleaner.hasHEPAFilter();
		System.out.println("Has HEPA filter: "+filter);
	}
}