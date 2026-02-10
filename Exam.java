class ExamApplication{

	static void applicationForExam(String applicantName,int age,String gender,String qualification,String examName,String religion,boolean anyDisability,long contactNumber,String emailId,String feePaymentMode){
		System.out.println("The Applicant Name is: "+applicantName);
		System.out.println("The Age is: "+age);
		System.out.println("The Gender is: "+gender);
		System.out.println("The Qualification is: "+qualification);
		System.out.println("The Exam Name is: "+examName);
		System.out.println("The Religion is: "+religion);
		System.out.println("Any Disability: "+anyDisability);
		System.out.println("The Contact Number is: "+contactNumber);
		System.out.println("The Email ID is: "+emailId);
		System.out.println("The Fee Payment Mode is: "+feePaymentMode);
	}

	public static void main(String[] args){
		applicationForExam("VinodB",22,"Male","Engineering","UPSE","Hindu",false,9353745491L,"vinodbalikai4@gmail.com","Online");
	}
}
