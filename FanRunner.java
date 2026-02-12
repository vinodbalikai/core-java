class FanRunner{
	public static void main(String [] fan){
		boolean status=Fan.onOrOf();
		Fan.increaseSpeed();
		System.out.println(" ");
		Fan.increaseSpeed();
		System.out.println(" ");
		Fan.decreaseSpeed();
		System.out.println(" ");
		Fan.decreaseSpeed();
		System.out.println(" ");
	}
}