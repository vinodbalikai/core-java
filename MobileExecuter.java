class MobileExecuter{
	public static void main(String [] mobile){
		Double price =Mobile.getPrice();
        System.out.println("The price of the mobile is: "+price);
		
		String brand=Mobile.getBrand();
		System.out.println("The brand of the mobile is: "+brand);
		
		int storage=Mobile.getStorage();
		System.out.println("The storage is: "+storage+"GB");
		
		int ram=Mobile.getRam();
		System.out.println("The RAM is: "+ram+"GB");
		
		String camera=Mobile.getCameraQuality();
		System.out.println("The camera quality is: "+camera);
		
		int battery=Mobile.getBatteryCapacity();
		System.out.println("The battery capacity is: "+battery);
	}
}