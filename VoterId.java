class VoterIdApplication{

	static void applicationForVoterId(String fullName,int age,String gender,long adharNumber,boolean eligibleToVote,String address,int pincode,String district,boolean anyDisability,String qualification){
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The Age is: "+age);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Aadhar Number is: "+adharNumber);
		System.out.println("Eligible To Vote: "+eligibleToVote);
		System.out.println("The Address is: "+address);
		System.out.println("The Pincode is: "+pincode);
		System.out.println("The District is: "+district);
		System.out.println("Any Disability: "+anyDisability);
		System.out.println("The Qualification is: "+qualification);
	}

	public static void main(String[] args){
		applicationForVoterId("Vinod Basappa Balikai",22,"Male",974163542173L,true,"K C Nagar 3rd Cross Bailhongal",591102,"Belagavi",false,"Graduation");
	}
}
