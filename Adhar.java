class AdharUpdate{
	static void updateUserAdharCard(String name,String updatedName,String gender,int age,String dateOfBirth,String address,int pincode,String district,long mobileNumber){
		System.out.println("The Name of the user is: "+name);
		System.out.println("The Updated Name of the user is: "+updatedName);
		System.out.println("The gender of the user is: "+gender);
		System.out.println("The age of the user is: "+age);
		System.out.println("The Date of birth of the user is: "+dateOfBirth);
		System.out.println("The Address of the user is: "+address);
		System.out.println("The Pincode of the user address is: "+pincode);
		System.out.println("The Mobile Number of the user is: "+mobileNumber);
		

	}
	public static void main(String[]args){
		updateUserAdharCard("Vinod","Vinod Balikai","male",22,"04/07/2004","Bailhongal",591102,"Belagavi",9353745491L);
	}
}

