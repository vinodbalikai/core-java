class MixerGrinderExecuter{
	public static void main(String [] mix){
		Double price =MixerGrinder.getPrice();
        System.out.println("The price of the mixer grinder is: "+price);
		
		String brand=MixerGrinder.getBrand();
		System.out.println("The brand of the mixer grinder is: "+brand);
		
		int jars=MixerGrinder.getNumberOfJars();
		System.out.println("Number of jars: "+jars);
		
		int power=MixerGrinder.getPower();
		System.out.println("Motor power: "+power+"W");
		
		int speed=MixerGrinder.getSpeedLevels();
		System.out.println("Speed levels: "+speed);
		
		boolean protection=MixerGrinder.hasOverloadProtection();
		System.out.println("Has overload protection: "+protection);
	}
}