class IronBoxExecuter{
	public static void main(String [] iron){
		Double price =IronBox.getPrice();
        System.out.println("The price of the iron box is: "+price);
		
		String brand=IronBox.getBrand();
		System.out.println("The brand of the iron box is: "+brand);
		
		int power=IronBox.getPower();
		System.out.println("Power: "+power+"W");
		
		String plate=IronBox.getSoleplateType();
		System.out.println("Soleplate type: "+plate);
		
		boolean steam=IronBox.hasSteamFeature();
		System.out.println("Has steam feature: "+steam);
		
		boolean auto=IronBox.hasAutoShutOff();
		System.out.println("Has auto shut off: "+auto);
	}
}