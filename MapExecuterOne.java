class MapExecuterOne{
	public static void main(String[] game){
		Location location =new Location();
		location.locationName="Bangalore";
		location.locationCountry="India";
		location.locationPopulation=12045300;
		location.locationArea=800.00;
		location.locationFamousPlace="Lalbagh";
		
		Map map=new Map();
		map.location=location;
		map.mapId=17;
		
		map.getMapDetails();
	}
}