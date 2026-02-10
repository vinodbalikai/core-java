class RationCardApplication{

	static void applicationForRationCard(String headOfFamily,String gender,int age,String occupation,String religion,String permanentAddress,int pincode,long adharNumber,int yearlyIncome,long mobileNumber){
		System.out.println("The Head Of Family is: "+headOfFamily);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Age is: "+age);
		System.out.println("The Occupation is: "+occupation);
		System.out.println("The Religion is: "+religion);
		System.out.println("The Permanent Address is: "+permanentAddress);
		System.out.println("The Pincode is: "+pincode);
		System.out.println("The Aadhar Number is: "+adharNumber);
		System.out.println("The Yearly Income is: "+yearlyIncome);
		System.out.println("The Mobile Number is: "+mobileNumber);
	}

	public static void main(String[] args){
		applicationForRationCard("Basappa Balikai","Male",57,"Farmer","Hindu","K C Nagar Bailhongal",591102,974163542173L,200000,9353745491L);
	}
}
