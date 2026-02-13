class FanExecuter{
	public static void main(String [] fan){
		Double price =Fan.getPrice();
        System.out.println("The price of the fan is: "+price);
		
		String brand=Fan.getBrand();
		System.out.println("The brand of the fan is: "+brand);
		
		int speed=Fan.getSpeedLevels();
		System.out.println("Speed levels: "+speed);
		
		String type=Fan.getType();
		System.out.println("The type is: "+type);
		
		int power=Fan.getPowerConsumption();
		System.out.println("Power consumption: "+power+"W");
		
		boolean remote=Fan.hasRemote();
		System.out.println("Has remote: "+remote);
	}
}