class RouterExecuter{
	public static void main(String [] route){
		Double price =Router.getPrice();
        System.out.println("The price of the router is: "+price);
		
		String brand=Router.getBrand();
		System.out.println("The brand of the router is: "+brand);
		
		int speed=Router.getSpeed();
		System.out.println("The speed is: "+speed+" Mbps");
		
		int antennas=Router.getNumberOfAntennas();
		System.out.println("Number of antennas: "+antennas);
		
		String band=Router.getFrequencyBand();
		System.out.println("The frequency band is: "+band);
		
		boolean firewall=Router.hasFirewall();
		System.out.println("Has firewall: "+firewall);
	}
}