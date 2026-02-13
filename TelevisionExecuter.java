class TelevisionExecuter{
	public static void main(String [] tv){
		Double price =Television.getPrice();
        System.out.println("The price of the television is: "+price);
		
		String brand=Television.getBrand();
		System.out.println("The brand of the television is: "+brand);
		
		int size=Television.getScreenSize();
		System.out.println("The screen size is: "+size+" inches");
		
		String display=Television.getDisplayType();
		System.out.println("The display type is: "+display);
		
		String resolution=Television.getResolution();
		System.out.println("The resolution is: "+resolution);
		
		boolean smart=Television.isSmartTV();
		System.out.println("Is Smart TV: "+smart);
	}
}