class LaptopExecuter{
	public static void main(String [] laptop){
		Double price =Laptop.getPrice();
        System.out.println("The price of the laptop is: "+price);
		
		String brand=Laptop.getBrand();
		System.out.println("The brand of the laptop is: "+brand);
		
		String processor=Laptop.getProcessor();
		System.out.println("The processor is: "+processor);
		
		int ram=Laptop.getRamSize();
		System.out.println("The RAM size is: "+ram+"GB");
		
		String storage=Laptop.getStorageType();
		System.out.println("The storage type is: "+storage);
		
		int battery=Laptop.getBatteryCapacity();
		System.out.println("The battery capacity is: "+battery);
	}
}