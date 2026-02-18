class SwiggyExecuter{
	public static void main(String [] swiggy){
		String foodName="Appam";
		double foodPrice=Swiggy.getFoodPrice(foodName);
		System.out.println("The price of the "+foodName+" is: "+foodPrice);
	}
}
