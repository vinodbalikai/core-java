class Dance{
	boolean isClassical;
	int noOfPerformers;
	Form form;
	
	public void getDanceDetails(){
		System.out.println("Is this a classical dance: "+isClassical);
		System.out.println("No of performers in the dance: "+noOfPerformers);
		this.form.getFormDetails();
	}
}