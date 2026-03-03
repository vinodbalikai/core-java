class BarRunner{
	public static void main(String [] bar){
		Bar barObj = new Bar();
		barObj.barName="Blue Moon Bar";
		barObj.ownerName="Rakesh";
		barObj.barSince=2005;
		barObj.address="MG Road Belagavi";
		barObj.barOpenTime="12pm";
		barObj.barCloseTime="12am";
		barObj.closedOn="Monday";
		barObj.speciality="Beer, Whisky, Snacks";
		System.out.println("Name of the Bar is: "+barObj.barName);
		System.out.println("Name of the Owner is: "+barObj.ownerName);
		System.out.println("Bar Started on: "+barObj.barSince);
		System.out.println("The Address of the Bar is: "+barObj.address);
		System.out.println("Bar opens at: "+barObj.barOpenTime);
		System.out.println("Bar closes at: "+barObj.barCloseTime);
		System.out.println("Bar will be closed on: "+barObj.closedOn);
		System.out.println("The speciality has: "+barObj.speciality);
	}
}