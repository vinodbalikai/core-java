class DefenceApplication{

	static void ApplicationForDefence(String candidateName,int age,String gender,String fatherName,String motherName,String fatherOccupation,String qualification,String address,int pincode,int heightInCm,int weight,boolean anyDisability,String maritalStatus){
		System.out.println("The Candidate Name is: "+candidateName);
		System.out.println("The Age is: "+age);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Father Name is: "+fatherName);
		System.out.println("The Mother Name is: "+motherName);
		System.out.println("The Father Occupation is: "+fatherOccupation);
		System.out.println("The Qualification is: "+qualification);
		System.out.println("The Address is: "+address);
		System.out.println("The Pincode is: "+pincode);
		System.out.println("The Height (in cm) is: "+heightInCm);
		System.out.println("The Weight is: "+weight);
		System.out.println("Any Disability: "+anyDisability);
		System.out.println("The Marital Status is: "+maritalStatus);
	}

	public static void main(String[] args){
		ApplicationForDefence("Vinod Balikai",24,"Male","Basappa Balikai","Shantavva","Teacher","Graduation","K C Nagar 3rd Cross Bailhongal",591102,168,64,false,"Unmarried");
	}
}
