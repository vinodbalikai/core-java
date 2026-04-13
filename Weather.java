class Weather{
	int weatherId;
	Climate climate;
	
	public boolean creatClimate(int weatherId,Climate climate){
		boolean isClimateCreated=false;
		this.weatherId=weatherId;
		this.climate=climate;
		isClimateCreated=true;
		return isClimateCreated;
	}
	Weather(){
		
	}
	
	public Weather(int weatherId,Climate climate){
		this.weatherId=weatherId;
		this.climate=climate;
	}
	
	public void getWeatherDetails(){
		System.out.println("The Weather id is: "+weatherId);
		System.out.println("The climate type is: "+climate.climateType);
		System.out.println("The region is: "+climate.region);
		System.out.println("The average temperature is: "+climate.avgTemperature);
		System.out.println("The humidity level is: "+climate.humidity);
		System.out.println("The season is: "+climate.season);
	}
}



