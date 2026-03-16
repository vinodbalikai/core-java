class Train{
	boolean isExpress;
	int noOfCoaches;
	Bogie bogie;
	
	public void getTrainDetails(){
		System.out.println("Is this an express train: "+isExpress);
		System.out.println("Number of coaches in the train: "+noOfCoaches);
		this.bogie.getBogieDetails();
	}
}

