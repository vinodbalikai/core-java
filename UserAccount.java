class UserAccount{
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private long userPhone;
	private String userAddress;
	private String accountStatus;
	
	
	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return this.userId;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserEmail(String userEmail){
		this.userEmail=userEmail;
	}
	public String getUserEmail(){
		return this.userEmail;
	}
	
	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}
	public String getUserPassword(){
		return this.userPassword;
	}
	
	public void setUserPhone(long userPhone){
		this.userPhone=userPhone;
	}
	public long getUserPhone(){
		return this.userPhone;
	}
	
	public void setUserAddress(String userAddress){
		this.userAddress=userAddress;
	}
	public String getUserAddress(){
		return this.userAddress;
	}
	
	public void setAccountStatus(String accountStatus){
		this.accountStatus=accountStatus;
	}
	public String getAccountStatus(){
		return this.accountStatus;
	}
	
	
}