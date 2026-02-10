class PMAYApplication{

	static void applicationForPMAY(String headOfFamily,int age,String gender,String permanentAddress,int income,String city,String state,long adharNumber,long telephoneNumber,String occupation,String religion,boolean bplCardAvailable){
		System.out.println("The Head Of Family is: "+headOfFamily);
		System.out.println("The Age is: "+age);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Permanent Address is: "+permanentAddress);
		System.out.println("The Annual Income is: "+income);
		System.out.println("The City is: "+city);
		System.out.println("The State is: "+state);
		System.out.println("The Aadhar Number is: "+adharNumber);
		System.out.println("The Telephone Number is: "+telephoneNumber);
		System.out.println("The Occupation is: "+occupation);
		System.out.println("The Religion is: "+religion);
		System.out.println("BPL Card Available: "+bplCardAvailable);
	}

	public static void main(String[] args){
		applicationForPMAY("Basappa Balikai",57,"Male","K C Nagar Bailhongal",200000,"Bailhongal","Karnataka",974163542173L,9353745491L,"Farmer","Hindu",true);
	}
}
