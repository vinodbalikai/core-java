class Tourism{
	String placeName;
	int price;
	Package pack;
	
	public void getTourismDetails(){
		System.out.println("The name of the tourist place is: "+placeName);
		System.out.println("The price of the tourism is: "+price);
		this.pack.getPackageDetails();
	}
}

