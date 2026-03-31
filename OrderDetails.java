class OrderDetails{
	private int orderId;
	private String orderName;
	private String orderType;
	private String orderDate;
	private String orderAddress;
	private String orderStatus;
	private double orderAmount;
	
	
	public void setOrderId(int orderId){
		this.orderId=orderId;
	}
	public int getOrderId(){
		return this.orderId;
	}
	
	public void setOrderName(String orderName){
		this.orderName=orderName;
	}
	public String getOrderName(){
		return this.orderName;
	}
	
	public void setOrderType(String orderType){
		this.orderType=orderType;
	}
	public String getOrderType(){
		return this.orderType;
	}
	
	public void setOrderDate(String orderDate){
		this.orderDate=orderDate;
	}
	public String getOrderDate(){
		return this.orderDate;
	}
	
	public void setOrderAddress(String orderAddress){
		this.orderAddress=orderAddress;
	}
	public String getOrderAddress(){
		return this.orderAddress;
	}
	
	public void setOrderStatus(String orderStatus){
		this.orderStatus=orderStatus;
	}
	public String getOrderStatus(){
		return this.orderStatus;
	}
	
	public void setOrderAmount(long orderAmount){
		this.orderAmount=orderAmount;
	}
	public double getOrderAmount(){
		return this.orderAmount;
	}
	
	
}