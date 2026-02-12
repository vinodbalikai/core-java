class RefrigeratorRunner{
	public static void main(String [] rf){
		boolean status=Refrigerator.onOrOf();
		Refrigerator.increaseTemperature();
		System.out.println(" ");
		Refrigerator.increaseTemperature();
		System.out.println(" ");
		Refrigerator.decreaseTemperature();
		System.out.println(" ");
		Refrigerator.decreaseTemperature();
		System.out.println(" ");
	}
}
