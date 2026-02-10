class BusPassApplication{

	static void applyBusPass(String firstName,String lastName,int age,String gender,boolean student,String sourcePlace,String destination,String ksrtcDivision,String startDate,String endDate){
		System.out.println("The First Name is: "+firstName);
		System.out.println("The Last Name is: "+lastName);
		System.out.println("The Age is: "+age);
		System.out.println("The Gender is: "+gender);
		System.out.println("Is the applicant a student: "+student);
		System.out.println("The Source Place is: "+sourcePlace);
		System.out.println("The Destination is: "+destination);
		System.out.println("The KSRTC Division is: "+ksrtcDivision);
		System.out.println("The Start Date is: "+startDate);
		System.out.println("The End Date is: "+endDate);
	}

	public static void main(String[] args){
		applyBusPass("Vinod","Balikai",22,"Male",true,"Davangere","Chitradurga","Davangere","01/02/2026","01/05/2026");
	}
}
