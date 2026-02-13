class PrinterExecuter{
	public static void main(String [] print){
		Double price =Printer.getPrice();
        System.out.println("The price of the printer is: "+price);
		
		String brand=Printer.getBrand();
		System.out.println("The brand of the printer is: "+brand);
		
		String type=Printer.getPrintType();
		System.out.println("The print type is: "+type);
		
		int speed=Printer.getPrintSpeed();
		System.out.println("The print speed is: "+speed+" ppm");
		
		boolean wifi=Printer.hasWifi();
		System.out.println("Has WiFi: "+wifi);
		
		String color=Printer.getColorSupport();
		System.out.println("Color support: "+color);
	}
}