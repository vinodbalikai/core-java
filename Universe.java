class Universe{
	boolean hasGalaxies;
	int noOfPlanets;
	Earth earth;
	
	public void getUniverseDetails(){
		System.out.println("Does the universe have galaxies: "+hasGalaxies);
		System.out.println("Number of planets in the system: "+noOfPlanets);
		this.earth.getEarthDetails();
	}
}

