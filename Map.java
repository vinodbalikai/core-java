class Map{
	int mapId;
	Location location;
	
	public boolean creatLocation(int mapId,Location location){
		boolean isLocationCreated=false;
		this.mapId=mapId;
		this.location=location;
		isLocationCreated=true;
		return isLocationCreated;
	}
	Map(){
		
	}
	
	public Map(int mapId,Location location){
		this.mapId=mapId;
		this.location=location;
	}
	
	public void getMapDetails(){
		System.out.println("The Map id is: "+mapId);
		System.out.println("The name of the location is: "+location.locationName);
		System.out.println("The country of the location is: "+location.locationCountry);
		System.out.println("The population of the location is: "+location.locationPopulation);
		System.out.println("The area of the location is: "+location.locationArea);
		System.out.println("The famous place in the location is: "+location.locationFamousPlace);
	}
}



