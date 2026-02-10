class PensionApplication{

	static void applicationForPension(String fullName,int age,String dateOfBirth,boolean pensionEligible,String address,String postOffice,String identityProof,String maritalStatus){
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The Age is: "+age);
		System.out.println("The Date Of Birth is: "+dateOfBirth);
		System.out.println("Pension Eligible: "+pensionEligible);
		System.out.println("The Address is: "+address);
		System.out.println("The Post Office is: "+postOffice);
		System.out.println("The Identity Proof is: "+identityProof);
		System.out.println("The Marital Status is: "+maritalStatus);
	}

	public static void main(String[] args){
		applicationForPension("Yellappa Borakanavar",76,"01/02/1950",true,"Bailhongal","Bailhongal Head Office","Aadhar Card","Married");
	}
}
