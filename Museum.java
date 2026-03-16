class Museum{
	String museumName;
	int establishedYear;
	Project project;
	
	public void getMuseumDetails(){
		System.out.println("The name of the museum is: "+museumName);
		System.out.println("The museum established year is: "+establishedYear);
		this.project.getProjectDetails();
	}
}

