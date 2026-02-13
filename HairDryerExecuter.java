class HairDryerExecuter{
	public static void main(String [] hair){
		Double price =HairDryer.getPrice();
        System.out.println("The price of the hair dryer is: "+price);
		
		String brand=HairDryer.getBrand();
		System.out.println("The brand of the hair dryer is: "+brand);
		
		int power=HairDryer.getPower();
		System.out.println("Power: "+power+"W");
		
		int speed=HairDryer.getSpeedSettings();
		System.out.println("Speed settings: "+speed);
		
		boolean cool=HairDryer.hasCoolShot();
		System.out.println("Has cool shot: "+cool);
		
		String tech=HairDryer.getTechnology();
		System.out.println("Technology: "+tech);
	}
}