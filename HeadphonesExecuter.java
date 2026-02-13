class HeadphonesExecuter{
	public static void main(String [] head){
		Double price =Headphones.getPrice();
        System.out.println("The price of the headphones is: "+price);
		
		String brand=Headphones.getBrand();
		System.out.println("The brand of the headphones is: "+brand);
		
		String connectivity=Headphones.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
		
		int battery=Headphones.getBatteryLife();
		System.out.println("The battery life is: "+battery+" hours");
		
		boolean noise=Headphones.hasNoiseCancellation();
		System.out.println("Has noise cancellation: "+noise);
		
		String color=Headphones.getColor();
		System.out.println("The color is: "+color);
	}
}