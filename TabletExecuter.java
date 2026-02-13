class TabletExecuter{
	public static void main(String [] tab){
		Double price =Tablet.getPrice();
        System.out.println("The price of the tablet is: "+price);
		
		String brand=Tablet.getBrand();
		System.out.println("The brand of the tablet is: "+brand);
		
		int storage=Tablet.getStorage();
		System.out.println("The storage is: "+storage+"GB");
		
		int size=Tablet.getScreenSize();
		System.out.println("The screen size is: "+size+" inches");
		
		String os=Tablet.getOperatingSystem();
		System.out.println("The operating system is: "+os);
		
		int battery=Tablet.getBatteryCapacity();
		System.out.println("The battery capacity is: "+battery);
	}
}