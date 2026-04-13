class MapExecuterThree{
	public static void main(String[] game){
		Location location =new Location();
		location.locationName="Delhi";
		location.locationCountry="India";
		location.locationPopulation=19035730;
		location.locationArea=1500.00;
		location.locationFamousPlace="Red Fort";
		
		Map map=new Map();
		boolean isLocationCreated=map.creatLocation(11,location);
		System.out.println("The Map location created: "+isLocationCreated);
		
		map.getMapDetails();
	}
}