class SubscriptionDetails{
	private String subscriptionName;
	private int subscriptionId;
	private String planType;
	private String duration;
	private long price;
	private String userEmail;
	private String status;
	
	
	public void setSubscriptionName(String subscriptionName){
		this.subscriptionName=subscriptionName;
	}
	public String getSubscriptionName(){
		return this.subscriptionName;
	}
	
	public void setSubscriptionId(int subscriptionId){
		this.subscriptionId=subscriptionId;
	}
	public int getSubscriptionId(){
		return this.subscriptionId;
	}
	
	public void setPlanType(String planType){
		this.planType=planType;
	}
	public String getPlanType(){
		return this.planType;
	}
	
	public void setDuration(String duration){
		this.duration=duration;
	}
	public String getDuration(){
		return this.duration;
	}
	
	public void setPrice(long price){
		this.price=price;
	}
	public long getPrice(){
		return this.price;
	}
	
	public void setUserEmail(String userEmail){
		this.userEmail=userEmail;
	}
	public String getUserEmail(){
		return this.userEmail;
	}
	
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	
	
}