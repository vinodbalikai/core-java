class ECommerce{
	public static void main(String[] args){
		String websiteName="Amazon";
		String websiteOwnerName="Jeff Bezos";
		String websiteAddress="www.amazon.in";
		String productCategories[]={"Electronics","Fashion","Groceries","Books"};
		String deliveryOptions[]={"Standard Delivery","OneDay Delivery","Instant Delivery"};
		String paymentMethods[]={"Through Card","UPI","Cash on Delivery"};

		System.out.println("The name of the E-Commerce website is: "+websiteName);
		System.out.println("The owner of the website is: "+websiteOwnerName);
		System.out.println("The website address is: "+websiteAddress);

		System.out.println("The Product Categories available are");
		for(String productCategory:productCategories)System.out.println(productCategory);
		System.out.println(" ");
		System.out.println("The Delivery Options available are");
		for(String deliveryOption:deliveryOptions)System.out.println(deliveryOption);
		System.out.println(" ");
		System.out.println("The Payment Methods available are");
		for(String paymentMethod:paymentMethods)System.out.println(paymentMethod);
	}
}
