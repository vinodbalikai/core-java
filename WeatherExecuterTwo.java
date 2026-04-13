class WeatherExecuterTwo{
	public static void main(String[] game){
		Climate climate =new Climate();
		climate.climateType="Humid";
		climate.region="Coastal Area";
		climate.avgTemperature=30;
		climate.humidity=80.00;
		climate.season="Monsoon";
		
		Weather weather=new Weather(45,climate);
		
		weather.getWeatherDetails();
	}
}