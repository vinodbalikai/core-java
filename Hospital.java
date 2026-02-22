class Hospital{
	public static String[] findDoctorsBySpecilization(String specilization){
		System.out.println("The findDoctorsBySpecilization method is invoked");
		if(specilization.equals("General Medicine")){
			String[] generalMedicineDoctors= {"Dr.Hanumanth","Dr.Ankitha"};
			System.out.println("End of findDoctorsBySpecilization method");
			return generalMedicineDoctors;
		}else if(specilization.equals("Ortho")){
			String[] orthoDoctors={"Vinod","Vishal"};
			System.out.println("End of findDoctorsBySpecilization method");
			return orthoDoctors;
		}else if(specilization.equals("Cardiac Sciences")){
			String[] doctors={"Dr.Rajesh Kumar","Dr.Arun Nair","Dr.Vivek Sharma","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Dental Science")){
			String[] doctors={"Dr.Pooja Sharma","Dr.Anita Nair","Dr.Kavya Rao","Dr.Nisha Jain","Dr.Sneha Reddy","Dr.Ritu Shah","Dr.Divya Iyer","Dr.Megha Patil","Dr.Aarti Gupta","Dr.Komal Bhat","Dr.Radhika Menon","Dr.Shruti Kulkarni","Dr.Neha Verma","Dr.Priya Mehta","Dr.Ananya Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Dermatology")){
			String[] doctors={"Dr.Kiran Sharma","Dr.Megha Nair","Dr.Akansha Jain","Dr.Priya Rao","Dr.Ritu Patil","Dr.Sneha Shah","Dr.Nandini Iyer","Dr.Divya Menon","Dr.Komal Gupta","Dr.Smita Verma","Dr.Aarti Kulkarni","Dr.Rashmi Gowda","Dr.Kavita Bhat","Dr.Pooja Mehta","Dr.Anjali Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Diabetology/Endocrinology")){
			String[] doctors={"Dr.Sunil Kumar","Dr.Ramesh Nair","Dr.Vinod Rao","Dr.Harsha Reddy","Dr.Manoj Jain","Dr.Amit Shah","Dr.Karthik Iyer","Dr.Rajiv Menon","Dr.Deepesh Patil","Dr.Anil Gupta","Dr.Suresh Bhat","Dr.Naveen Kulkarni","Dr.Abhay Verma","Dr.Prakash Gowda","Dr.Samir Mehta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("ENT")){
			String[] doctors={"Dr.Rohit Sharma","Dr.Ajay Kulkarni","Dr.Suresh Nair","Dr.Hemanth Rao","Dr.Vivek Reddy","Dr.Kiran Bhat","Dr.Sachin Shah","Dr.Nikhil Verma","Dr.Anand Patil","Dr.Mahesh Jain","Dr.Pravin Iyer","Dr.Rajesh Menon","Dr.Sunil Mehta","Dr.Deepak Gowda","Dr.Varun Gupta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Emergency and Trauma")){
			String[] doctors={"Dr.Arjun Rao","Dr.Vikas Sharma","Dr.Naveen Nair","Dr.Kiran Reddy","Dr.Ajay Bhat","Dr.Rohit Jain","Dr.Samir Shah","Dr.Harish Patil","Dr.Sunil Verma","Dr.Deepak Iyer","Dr.Rajiv Menon","Dr.Anil Gupta","Dr.Manoj Kulkarni","Dr.Prakash Gowda","Dr.Vivek Mehta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Foetal Medicine")){
			String[] doctors={"Dr.Rekha Sharma","Dr.Anita Rao","Dr.Kalpana Nair","Dr.Savita Jain","Dr.Madhuri Reddy","Dr.Shilpa Iyer","Dr.Kavitha Menon","Dr.Neelam Shah","Dr.Rupa Mehta","Dr.Aparna Kulkarni","Dr.Sangeeta Bhat","Dr.Renuka Gupta","Dr.Deepali Patil","Dr.Lavanya Rao","Dr.Sonia Verma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Gastroenterology and Hepatobiliary Sciences")){
			String[] doctors={"Dr.Amit Kumar","Dr.Rakesh Nair","Dr.Vivek Rao","Dr.Kunal Jain","Dr.Pradeep Reddy","Dr.Ajay Shah","Dr.Nitin Mehta","Dr.Hemant Patil","Dr.Rajeev Menon","Dr.Anup Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao","Dr.Sachin Kulkarni","Dr.Varun Sharma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("General Surgery")){
			String[] doctors={"Dr.Suraj Kumar","Dr.Vinay Nair","Dr.Rohit Rao","Dr.Karthik Reddy","Dr.Manish Jain","Dr.Samir Shah","Dr.Abhishek Mehta","Dr.Anil Patil","Dr.Nikhil Verma","Dr.Rajiv Menon","Dr.Ajay Gupta","Dr.Suresh Bhat","Dr.Deepak Iyer","Dr.Praveen Gowda","Dr.Vikas Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Haematology")){
			String[] doctors={"Dr.Ramesh Sharma","Dr.Arun Nair","Dr.Vikas Rao","Dr.Kiran Reddy","Dr.Naveen Jain","Dr.Ajay Shah","Dr.Rohit Mehta","Dr.Harish Patil","Dr.Nitin Verma","Dr.Rajeev Menon","Dr.Anil Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao","Dr.Samir Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Infectious Diseases")){
			String[] doctors={"Dr.Amit Sharma","Dr.Rahul Nair","Dr.Kiran Rao","Dr.Naveen Reddy","Dr.Sandeep Jain","Dr.Vivek Shah","Dr.Anil Patil","Dr.Rajiv Menon","Dr.Sunil Gupta","Dr.Deepak Iyer","Dr.Prakash Gowda","Dr.Sachin Kulkarni","Dr.Varun Mehta","Dr.Ajay Bhat","Dr.Harish Verma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Infertility medicine")){
			String[] doctors={"Dr.Rekha Sharma","Dr.Anita Nair","Dr.Kalpana Rao","Dr.Savita Jain","Dr.Madhuri Reddy","Dr.Shilpa Iyer","Dr.Kavitha Menon","Dr.Neelam Shah","Dr.Rupa Mehta","Dr.Aparna Kulkarni","Dr.Sangeeta Bhat","Dr.Renuka Gupta","Dr.Deepali Patil","Dr.Lavanya Rao","Dr.Sonia Verma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Internal Medicine")){
			String[] doctors={"Dr.Ramesh Kumar","Dr.Vinod Nair","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon","Dr.Abhay Gupta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Mental Health and Behavioural Sciences")){
			String[] doctors={"Dr.Ananya Sharma","Dr.Ritu Nair","Dr.Priya Rao","Dr.Kavita Jain","Dr.Megha Reddy","Dr.Sneha Shah","Dr.Divya Iyer","Dr.Nandini Menon","Dr.Komal Gupta","Dr.Smita Verma","Dr.Aarti Kulkarni","Dr.Rashmi Gowda","Dr.Kavya Bhat","Dr.Pooja Mehta","Dr.Anjali Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Nephrology")){
			String[] doctors={"Dr.Sunil Kumar","Dr.Rajesh Nair","Dr.Vivek Sharma","Dr.Arun Prakash","Dr.Manish Gupta","Dr.Kunal Mehta","Dr.Ritesh Jain","Dr.Hemant Rao","Dr.Nitin Verma","Dr.Prasad Kulkarni","Dr.Ajay Shetty","Dr.Rohit Bansal","Dr.Vikas Shah","Dr.Samir Patil","Dr.Anand Iyer"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Neurointerventional Radiology")){
			String[] doctors={"Dr.Abhay Rao","Dr.Sameer Kulkarni","Dr.Vikram Nair","Dr.Deepesh Reddy","Dr.Kiran Shetty","Dr.Sachin Mehta","Dr.Amit Jain","Dr.Naveen Patil","Dr.Rahul Iyer","Dr.Anil Kumar","Dr.Prakash Gowda","Dr.Harsha Shah","Dr.Vinod Verma","Dr.Rajiv Menon","Dr.Sunil Bhat"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Neurology")){
			String[] doctors={"Dr.Rajesh Kumar","Dr.Arun Nair","Dr.Vivek Sharma","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Neurosurgery")){
			String[] doctors={"Dr.Rakesh Sharma","Dr.Vinay Nair","Dr.Rohit Rao","Dr.Karthik Reddy","Dr.Manish Jain","Dr.Samir Shah","Dr.Abhishek Mehta","Dr.Anil Patil","Dr.Nikhil Verma","Dr.Rajiv Menon","Dr.Ajay Gupta","Dr.Suresh Bhat","Dr.Deepak Iyer","Dr.Praveen Gowda","Dr.Vikas Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Obstetrics and Gynaecology")){
			String[] doctors={"Dr.Rekha Nair","Dr.Anita Sharma","Dr.Kalpana Reddy","Dr.Savita Rao","Dr.Poonam Jain","Dr.Madhuri Patil","Dr.Shilpa Iyer","Dr.Kavitha Menon","Dr.Neelam Verma","Dr.Rupa Shah","Dr.Aparna Kulkarni","Dr.Sangeeta Bhat","Dr.Renuka Mehta","Dr.Deepali Gupta","Dr.Lavanya Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Oncology")){
			String[] doctors={"Dr.Ramesh Sharma","Dr.Vinay Nair","Dr.Suraj Rao","Dr.Kunal Kulkarni","Dr.Manish Reddy","Dr.Ajay Jain","Dr.Rahul Shah","Dr.Vikas Mehta","Dr.Hemant Patil","Dr.Nitin Verma","Dr.Rajeev Menon","Dr.Anup Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Ophthalmology")){
			String[] doctors={"Dr.Akash Sharma","Dr.Vikas Nair","Dr.Rohan Rao","Dr.Pranav Kulkarni","Dr.Samir Reddy","Dr.Anil Jain","Dr.Karthik Shah","Dr.Nitin Mehta","Dr.Sandeep Patil","Dr.Rajiv Verma","Dr.Harish Menon","Dr.Vivek Gupta","Dr.Abhishek Bhat","Dr.Sachin Iyer","Dr.Manoj Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Organ Transplant")){
			String[] doctors={"Dr.Rajesh Kumar","Dr.Arun Nair","Dr.Vivek Sharma","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Orthopaedics")){
			String[] doctors={"Dr.Arjun Rao","Dr.Vinay Kulkarni","Dr.Rakesh Bhat","Dr.Nikhil Shetty","Dr.Pradeep Kumar","Dr.Abhishek Jain","Dr.Manoj Nair","Dr.Karthik Reddy","Dr.Sandeep Gowda","Dr.Harish Patil","Dr.Suraj Mehta","Dr.Rohan Verma","Dr.Ashwin Iyer","Dr.Varun Shah","Dr.Sachin Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Paediatrics")){
			String[] doctors={"Dr.Asha Nair","Dr.Kiran Rao","Dr.Sunita Sharma","Dr.Manjula Reddy","Dr.Priya Kulkarni","Dr.Vidya Menon","Dr.Deepa Jain","Dr.Ritu Patil","Dr.Swathi Iyer","Dr.Nandini Shah","Dr.Smita Verma","Dr.Anjali Mehta","Dr.Rashmi Gowda","Dr.Sonia Bhat","Dr.Kavya Sharma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Physiotherapy and Rehabilitation")){
			String[] doctors={"Dr.Rahul Sharma","Dr.Anita Reddy","Dr.Kiran Kumar","Dr.Pooja Nair","Dr.Sunil Rao","Dr.Deepak Shetty","Dr.Megha Jain","Dr.Vikas Mehta","Dr.Rohit Kulkarni","Dr.Naveen Gowda","Dr.Sneha Patil","Dr.Ajay Verma","Dr.Priya Menon","Dr.Amit Deshpande","Dr.Kavya Iyer"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Plastic and Reconstructive Surgery")){
			String[] doctors={"Dr.Rakesh Sharma","Dr.Vinay Nair","Dr.Rohit Rao","Dr.Karthik Reddy","Dr.Manish Jain","Dr.Samir Shah","Dr.Abhishek Mehta","Dr.Anil Patil","Dr.Nikhil Verma","Dr.Rajiv Menon","Dr.Ajay Gupta","Dr.Suresh Bhat","Dr.Deepak Iyer","Dr.Praveen Gowda","Dr.Vikas Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Pulmonology")){
			String[] doctors={"Dr.Sunil Kumar","Dr.Ramesh Nair","Dr.Vinod Rao","Dr.Harsha Reddy","Dr.Manoj Jain","Dr.Amit Shah","Dr.Karthik Iyer","Dr.Rajiv Menon","Dr.Deepesh Patil","Dr.Anil Gupta","Dr.Suresh Bhat","Dr.Naveen Kulkarni","Dr.Abhay Verma","Dr.Prakash Gowda","Dr.Samir Mehta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Radiology")){
			String[] doctors={"Dr.Abhay Rao","Dr.Sameer Kulkarni","Dr.Vikram Nair","Dr.Deepesh Reddy","Dr.Kiran Shetty","Dr.Sachin Mehta","Dr.Amit Jain","Dr.Naveen Patil","Dr.Rahul Iyer","Dr.Anil Kumar","Dr.Prakash Gowda","Dr.Harsha Shah","Dr.Vinod Verma","Dr.Rajiv Menon","Dr.Sunil Bhat"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Rheumatology")){
			String[] doctors={"Dr.Ramesh Sharma","Dr.Arun Nair","Dr.Vikas Rao","Dr.Kiran Reddy","Dr.Naveen Jain","Dr.Ajay Shah","Dr.Rohit Mehta","Dr.Harish Patil","Dr.Nitin Verma","Dr.Rajeev Menon","Dr.Anil Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao","Dr.Samir Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Support Specialties")){
			String[] doctors={"Dr.Amit Kumar","Dr.Rakesh Nair","Dr.Vivek Rao","Dr.Kunal Jain","Dr.Pradeep Reddy","Dr.Ajay Shah","Dr.Nitin Mehta","Dr.Hemant Patil","Dr.Rajeev Menon","Dr.Anup Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao","Dr.Sachin Kulkarni","Dr.Varun Sharma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Thoracic Surgery")){
			String[] doctors={"Dr.Rajesh Kumar","Dr.Arun Nair","Dr.Vivek Sharma","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Transfusion Medicine")){
			String[] doctors={"Dr.Ramesh Sharma","Dr.Vinay Nair","Dr.Suraj Rao","Dr.Kunal Kulkarni","Dr.Manish Reddy","Dr.Ajay Jain","Dr.Rahul Shah","Dr.Vikas Mehta","Dr.Hemant Patil","Dr.Nitin Verma","Dr.Rajeev Menon","Dr.Anup Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Urology")){
			String[] doctors={"Dr.Arjun Rao","Dr.Vinay Kulkarni","Dr.Rakesh Bhat","Dr.Nikhil Shetty","Dr.Pradeep Kumar","Dr.Abhishek Jain","Dr.Manoj Nair","Dr.Karthik Reddy","Dr.Sandeep Gowda","Dr.Harish Patil","Dr.Suraj Mehta","Dr.Rohan Verma","Dr.Ashwin Iyer","Dr.Varun Shah","Dr.Sachin Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Endocrine Surgery")){
			String[] doctors={"Dr.Sunil Kumar","Dr.Ramesh Nair","Dr.Vinod Rao","Dr.Harsha Reddy","Dr.Manoj Jain","Dr.Amit Shah","Dr.Karthik Iyer","Dr.Rajiv Menon","Dr.Deepesh Patil","Dr.Anil Gupta","Dr.Suresh Bhat","Dr.Naveen Kulkarni","Dr.Abhay Verma","Dr.Prakash Gowda","Dr.Samir Mehta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Vascular Surgery")){
			String[] doctors={"Dr.Rakesh Sharma","Dr.Vinay Nair","Dr.Rohit Rao","Dr.Karthik Reddy","Dr.Manish Jain","Dr.Samir Shah","Dr.Abhishek Mehta","Dr.Anil Patil","Dr.Nikhil Verma","Dr.Rajiv Menon","Dr.Ajay Gupta","Dr.Suresh Bhat","Dr.Deepak Iyer","Dr.Praveen Gowda","Dr.Vikas Kulkarni"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Liver Transplant and Hepatobiliary Sciences")){
			String[] doctors={"Dr.Amit Kumar","Dr.Rakesh Nair","Dr.Vivek Rao","Dr.Kunal Jain","Dr.Pradeep Reddy","Dr.Ajay Shah","Dr.Nitin Mehta","Dr.Hemant Patil","Dr.Rajeev Menon","Dr.Anup Gupta","Dr.Sunil Bhat","Dr.Deepesh Iyer","Dr.Prakash Rao","Dr.Sachin Kulkarni","Dr.Varun Sharma"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Palliative Medicine")){
			String[] doctors={"Dr.Ananya Sharma","Dr.Ritu Nair","Dr.Priya Rao","Dr.Kavita Jain","Dr.Megha Reddy","Dr.Sneha Shah","Dr.Divya Iyer","Dr.Nandini Menon","Dr.Komal Gupta","Dr.Smita Verma","Dr.Aarti Kulkarni","Dr.Rashmi Gowda","Dr.Kavya Bhat","Dr.Pooja Mehta","Dr.Anjali Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Medical Genetics")){
			String[] doctors={"Dr.Abhay Rao","Dr.Sameer Kulkarni","Dr.Vikram Nair","Dr.Deepesh Reddy","Dr.Kiran Shetty","Dr.Sachin Mehta","Dr.Amit Jain","Dr.Naveen Patil","Dr.Rahul Iyer","Dr.Anil Kumar","Dr.Prakash Gowda","Dr.Harsha Shah","Dr.Vinod Verma","Dr.Rajiv Menon","Dr.Sunil Bhat"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Pain and Palliative Medicine")){
			String[] doctors={"Dr.Rahul Sharma","Dr.Anita Reddy","Dr.Kiran Kumar","Dr.Pooja Nair","Dr.Sunil Rao","Dr.Deepak Shetty","Dr.Megha Jain","Dr.Vikas Mehta","Dr.Rohit Kulkarni","Dr.Naveen Gowda","Dr.Sneha Patil","Dr.Ajay Verma","Dr.Priya Menon","Dr.Amit Deshpande","Dr.Kavya Iyer"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Geriatric Medicine")){
			String[] doctors={"Dr.Ramesh Kumar","Dr.Vinod Nair","Dr.Kiran Rao","Dr.Nikhil Reddy","Dr.Ajay Mehta","Dr.Sandeep Jain","Dr.Harish Gowda","Dr.Rohit Bhat","Dr.Praveen Iyer","Dr.Samir Shah","Dr.Anand Patil","Dr.Vikas Verma","Dr.Sachin Kulkarni","Dr.Deepak Menon","Dr.Abhay Gupta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Critical Care")){
			String[] doctors={"Dr.Arjun Rao","Dr.Vinay Kulkarni","Dr.Rakesh Bhat","Dr.Nikhil Shetty","Dr.Pradeep Kumar","Dr.Abhishek Jain","Dr.Manoj Nair","Dr.Karthik Reddy","Dr.Sandeep Gowda","Dr.Harish Patil","Dr.Suraj Mehta","Dr.Rohan Verma","Dr.Ashwin Iyer","Dr.Varun Shah","Dr.Sachin Rao"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}else if(specilization.equals("Nuclear Medicine")){
			String[] doctors={"Dr.Sunil Kumar","Dr.Ramesh Nair","Dr.Vinod Rao","Dr.Harsha Reddy","Dr.Manoj Jain","Dr.Amit Shah","Dr.Karthik Iyer","Dr.Rajiv Menon","Dr.Deepesh Patil","Dr.Anil Gupta","Dr.Suresh Bhat","Dr.Naveen Kulkarni","Dr.Abhay Verma","Dr.Prakash Gowda","Dr.Samir Mehta"};
			System.out.println("End of findDoctorsBySpecilization method");
			return doctors;
		}
		return null;
	}
	
	public static void getDoctors(String[] doctors){
		System.out.println("getDoctors method is invoked");
		for(String doctor:doctors){
			System.out.println("The Doctors are: ");
			System.out.println(doctor);
		}
	}
}
//.equalsIgnore