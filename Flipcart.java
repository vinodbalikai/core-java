class FlipcartAccount{

	static void createFlipcartAccount(String mailId,long mobileNumber,int verifyOtp,String userName,String setPassword,boolean confirmPassword,boolean accessLocation){
		System.out.println("The Mail ID is: "+mailId);
		System.out.println("The Mobile Number is: "+mobileNumber);
		System.out.println("The OTP is: "+verifyOtp);
		System.out.println("The User Name is: "+userName);
		System.out.println("Password Set Successfully");
		System.out.println("Password Confirmed: "+confirmPassword);
		System.out.println("Location Access Allowed: "+accessLocation);
	}

	public static void main(String[] args){
		createFlipcartAccount("abhisunagar118@gmail.com",9353745491L,4252,"Abhi","Abhi@118",true,true);
	}
}
