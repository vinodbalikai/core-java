class Passport{

	static void applicationForPassport(String fullName,int age,String maritalStatus,String gender,String nationality,String address,String qualification,boolean employed,int bookletSize,int validityRequired){
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The Age is: "+age);
		System.out.println("The Marital Status is: "+maritalStatus);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Nationality is: "+nationality);
		System.out.println("The Address is: "+address);
		System.out.println("The Qualification is: "+qualification);
		System.out.println("Employed Status: "+employed);
		System.out.println("The Booklet Size is: "+bookletSize);
		System.out.println("The Validity Required is: "+validityRequired+" Years");
	}

	public static void main(String[] args){
		applicationForPassport("Vinod Balikai",22,"Unmarried","Male","Indian","K C Nagar 3rd Cross Bailhongal","Graduation",false,36,10);
	}
}
