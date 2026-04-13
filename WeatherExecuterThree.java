class WeatherExecuterThree{
	public static void main(String[] game){
		Climate climate =new Climate();
		climate.climateType="Dry";
		climate.region="North India";
		climate.avgTemperature=28;
		climate.humidity=40.00;
		climate.season="Winter";
		
		Weather weather=new Weather();
		boolean isClimateCreated=weather.creatClimate(11,climate);
		System.out.println("The Weather climate created: "+isClimateCreated);
		
		weather.getWeatherDetails();
	}
}