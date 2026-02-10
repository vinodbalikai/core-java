class LoanApplication{

	static void applicationForLoan(String fullName,String fatherName,String motherName,String applicantOccupation,int applicantIncomePerYear,String fatherOccupation,String motherOccupation,String permanentAddress,int pincode,long accountNumber,int loanAmount){
		System.out.println("The Full Name is: "+fullName);
		System.out.println("The Father Name is: "+fatherName);
		System.out.println("The Mother Name is: "+motherName);
		System.out.println("The Applicant Occupation is: "+applicantOccupation);
		System.out.println("The Applicant Income Per Year is: "+applicantIncomePerYear);
		System.out.println("The Father Occupation is: "+fatherOccupation);
		System.out.println("The Mother Occupation is: "+motherOccupation);
		System.out.println("The Permanent Address is: "+permanentAddress);
		System.out.println("The Pincode is: "+pincode);
		System.out.println("The Account Number is: "+accountNumber);
		System.out.println("The Loan Amount is: "+loanAmount);
	}

	public static void main(String[] args){
		applicationForLoan("Vinod Basappa Balikai","Basappa I Balikai","Shantavva Y Borakanavar","Engineer",600000,"Teacher","Teacher","K C Nagar Bailhongal",591102,13510004251L,500000);
	}
}
