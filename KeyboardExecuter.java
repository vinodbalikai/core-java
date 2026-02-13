class KeyboardExecuter{
	public static void main(String [] key){
		Double price =Keyboard.getPrice();
        System.out.println("The price of the keyboard is: "+price);
		
		String brand=Keyboard.getBrand();
		System.out.println("The brand of the keyboard is: "+brand);
		
		String type=Keyboard.getType();
		System.out.println("The type is: "+type);
		
		boolean back=Keyboard.hasBacklight();
		System.out.println("Has backlight: "+back);
		
		String connectivity=Keyboard.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
		
		int keys=Keyboard.getNumberOfKeys();
		System.out.println("Number of keys: "+keys);
	}
}