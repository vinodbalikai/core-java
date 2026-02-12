class ACRunner{
	public static void main(String [] ac){
		boolean status=AC.onOrOf();
		//System.out.println("The AC is on: "+status);
		AC.increaseTemperature();
		System.out.println(" ");
		AC.increaseTemperature();
		System.out.println(" ");
		AC.decreaseTemperature();
		System.out.println(" ");
		AC.decreaseTemperature();
		System.out.println(" ");
	}
}