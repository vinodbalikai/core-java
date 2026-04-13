class WeatherExecuterOne{
	public static void main(String[] game){
		Climate climate =new Climate();
		climate.climateType="Tropical";
		climate.region="South India";
		climate.avgTemperature=32;
		climate.humidity=75.00;
		climate.season="Summer";
		
		Weather weather=new Weather();
		weather.climate=climate;
		weather.weatherId=17;
		
		weather.getWeatherDetails();
	}
}