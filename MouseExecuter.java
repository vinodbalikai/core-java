class MouseExecuter{
	public static void main(String [] mouse){
		Double price =Mouse.getPrice();
        System.out.println("The price of the mouse is: "+price);
		
		String brand=Mouse.getBrand();
		System.out.println("The brand of the mouse is: "+brand);
		
		String type=Mouse.getType();
		System.out.println("The type is: "+type);
		
		String connectivity=Mouse.getConnectivity();
		System.out.println("The connectivity is: "+connectivity);
		
		int dpi=Mouse.getDPI();
		System.out.println("The DPI is: "+dpi);
		
		boolean scroll=Mouse.hasScrollWheel();
		System.out.println("Has scroll wheel: "+scroll);
	}
}