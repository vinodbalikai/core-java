class Wonderla{
	boolean hasWaterRides;
	int noOfRides;
	LazyPool lazyPool;
	
	public void getWonderlaDetails(){
		System.out.println("Does Wonderla have water rides: "+hasWaterRides);
		System.out.println("Number of rides in Wonderla: "+noOfRides);
		this.lazyPool.getLazyPoolDetails();
	}
}

