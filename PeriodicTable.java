class PeriodicTable{
	int noOfElements;
	boolean hasMetals;
	Elements elements;
	
	public void getPeriodicTableDetails(){
		System.out.println("Number of elements in the periodic table: "+noOfElements);
		System.out.println("Does it contain metals: "+hasMetals);
		this.elements.getElementsDetails();
	}
}

