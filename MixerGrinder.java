class MixerGrinder{
	static Double getPrice(){
		System.out.println("Fetching the mixer grinder price");
		return 5000.00;
	}
	static String getBrand(){
		System.out.println("Fetching the brand of the mixer grinder");
		return "Prestige";
	}
	static int getNumberOfJars(){
		System.out.println("Fetching number of jars");
		return 3;
	}
	static int getPower(){
		System.out.println("Getting motor power");
		return 750;
	}
	static int getSpeedLevels(){
		System.out.println("Fetching speed levels");
		return 3;
	}
	static boolean hasOverloadProtection(){
		System.out.println("Checking overload protection");
		return true;
	}
}
