class HeaterRunner{
	public static void main(String [] heater){
		boolean status=Heater.onOrOf();
		Heater.increaseTemperature();
		System.out.println(" ");
		Heater.increaseTemperature();
		System.out.println(" ");
		Heater.decreaseTemperature();
		System.out.println(" ");
		Heater.decreaseTemperature();
		System.out.println(" ");
	}
}