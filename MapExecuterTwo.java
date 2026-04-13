class MapExecuterTwo{
	public static void main(String[] game){
		Location location =new Location();
		location.locationName="Mumbai";
		location.locationCountry="India";
		location.locationPopulation=20378000;
		location.locationArea=450.00;
		location.locationFamousPlace="Gateway of India";
		
		Map map=new Map(45,location);
		
		map.getMapDetails();
	}
}