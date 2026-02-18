class CellPhoneExecuter{
	public static void main(String [] cellphone){
		String contactName="Vinod";
		long contactNo=CellPhone.getContactNumber(contactName);
		System.out.println("The contact number of "+contactName+" is: "+contactNo);
	}
}