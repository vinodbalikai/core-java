class PassportUser{
	private String userName;
	private int passportId;
	private long contactNumber;
	private String passportStatus;
	private String nationality;
	private String address;
	private String passportType;
	
	
	public void setPassportId(int passportId){
		this.passportId=passportId;
	}
	public int getPassportId(){
		return this.passportId;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	
	public void setNationality(String nationality){
		this.nationality=nationality;
	}
	public String getNationality(){
		return this.nationality;
	}
	
	public void setPassportType(String passportType){
		this.passportType=passportType;
	}
	public String getPassportType(){
		return this.passportType;
	}
	
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}
	public long getContactNumber(){
		return this.contactNumber;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setPassportStatus(String passportStatus){
		this.passportStatus=passportStatus;
	}
	public String getPassportStatus(){
		return this.passportStatus;
	}
	
	
}