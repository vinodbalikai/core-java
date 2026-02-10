class FacebookAccount{

	static void createFacebookAccount(String firstName,String lastName,long contactNumber,String email,String dateOfBirth,String gender,String setPassword,boolean confirmPassword){
		System.out.println("The First Name is: "+firstName);
		System.out.println("The Last Name is: "+lastName);
		System.out.println("The Contact Number is: "+contactNumber);
		System.out.println("The Email is: "+email);
		System.out.println("The Date Of Birth is: "+dateOfBirth);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Password is Set");
		System.out.println("Password Confirmed: "+confirmPassword);
	}

	public static void main(String[] args){
		createFacebookAccount("Vinod","Balikai",9353745491L,"vinodbalikai4@gmail.com","04/07/2004","Male","Vinod@fb",true);
	}
}
