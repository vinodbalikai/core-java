class InstagramAccount{

	static void createInstagramAccount(String mailId,long mobileNumber,String fullName,String userName,String dateOfBirth,String gender,String setPassword,boolean confirmPassword){
		System.out.println("The Mail ID is: "+mailId);
		System.out.println("The Mobile Number is: "+mobileNumber);
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The User Name is: "+userName);
		System.out.println("The Date Of Birth is: "+dateOfBirth);
		System.out.println("The Gender is: "+gender);
		System.out.println("Password Set Successfully");
		System.out.println("Password Confirmed: "+confirmPassword);
	}

	public static void main(String[] args){
		createInstagramAccount("vinodbalikai4@gmail.com",9353745491L,"Vinod Balikai","Vinod_B_B","04/07/2004","Male","Vinod@0405",true);
	}
}
