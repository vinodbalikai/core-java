class AmazonAccount{
    static void createAmazonAccount(long mobileNumber,String emailId,String userName,String password,boolean confirmPassword,String address,int pincode){
        System.out.println("The Mobile Number is: " +mobileNumber);
        System.out.println("The Email ID is: " +emailId);
        System.out.println("The User Name is: " +userName);
        System.out.println("The Password is: " +password);
        System.out.println("Password Confirmed: " +confirmPassword);
        System.out.println("The Address is: " +address);
        System.out.println("The Pincode is: " +pincode);
    }
    public static void main(String[] args) {
        createAmazonAccount(9353745491L,"vinodbalikai4@gmail.com","Vinod","Vinod@123",true,"Davanagere",577004);
    }
}
