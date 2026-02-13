class PowerBankExecuter{
	public static void main(String [] power){
		Double price =PowerBank.getPrice();
        System.out.println("The price of the power bank is: "+price);
		
		String brand=PowerBank.getBrand();
		System.out.println("The brand of the power bank is: "+brand);
		
		int capacity=PowerBank.getCapacity();
		System.out.println("The capacity is: "+capacity+" mAh");
		
		int ports=PowerBank.getOutputPorts();
		System.out.println("Output ports: "+ports);
		
		boolean fast=PowerBank.hasFastCharging();
		System.out.println("Has fast charging: "+fast);
		
		String color=PowerBank.getColor();
		System.out.println("The color is: "+color);
	}
}