class AirPurifierExecuter{
	public static void main(String [] air){
		Double price =AirPurifier.getPrice();
        System.out.println("The price of the air purifier is: "+price);
		
		String brand=AirPurifier.getBrand();
		System.out.println("The brand of the air purifier is: "+brand);
		
		int area=AirPurifier.getCoverageArea();
		System.out.println("Coverage area: "+area+" sq ft");
		
		String filter=AirPurifier.getFilterType();
		System.out.println("Filter type: "+filter);
		
		int noise=AirPurifier.getNoiseLevel();
		System.out.println("Noise level: "+noise+" dB");
		
		boolean indicator=AirPurifier.hasAirQualityIndicator();
		System.out.println("Has air quality indicator: "+indicator);
	}
}