class LicenseApplication{

	static void applicationForLicense(String fullName,int age,boolean physicallyDisabled,boolean knowDriving,String dateOfBirth,String district,String rtoName,String llrStatus,String address,int pincode){
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The Age is: "+age);
		System.out.println("Physically Disabled: "+physicallyDisabled);
		System.out.println("Knows Driving: "+knowDriving);
		System.out.println("The Date Of Birth is: "+dateOfBirth);
		System.out.println("The District is: "+district);
		System.out.println("The RTO Name is: "+rtoName);
		System.out.println("The LLR Status is: "+llrStatus);
		System.out.println("The Address is: "+address);
		System.out.println("The Pincode is: "+pincode);
	}

	public static void main(String[] args){
		applicationForLicense("Vinod Balikai",22,false,true,"05/01/2003","Belagavi","Bailhongal RTO","Applied","K C Nagar Bailhongal",591102);
	}
}
