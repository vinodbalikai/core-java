class MonitorExecuter{
	public static void main(String [] monitor){
		Double price =Monitor.getPrice();
        System.out.println("The price of the monitor is: "+price);
		
		String brand=Monitor.getBrand();
		System.out.println("The brand of the monitor is: "+brand);
		
		int size=Monitor.getScreenSize();
		System.out.println("The screen size is: "+size+" inches");
		
		String resolution=Monitor.getResolution();
		System.out.println("The resolution is: "+resolution);
		
		String panel=Monitor.getPanelType();
		System.out.println("The panel type is: "+panel);
		
		int refresh=Monitor.getRefreshRate();
		System.out.println("The refresh rate is: "+refresh+"Hz");
	}
}