class SanitizerRunner{
	public static void main(String [] sanitizer){
		Sanitizer sanitizerObj = new Sanitizer();
		sanitizerObj.brand="Dettol";
		sanitizerObj.price=100;
		sanitizerObj.manufacturer="Reckitt";
		sanitizerObj.type="Hand Sanitizer";
		sanitizerObj.quantity="200ml";
		sanitizerObj.alcoholContent="70%";
		sanitizerObj.fragrance="Fresh";
		sanitizerObj.expiry="24 Months";
		System.out.println("Brand is: "+sanitizerObj.brand);
		System.out.println("Price is: "+sanitizerObj.price);
		System.out.println("Manufacturer is: "+sanitizerObj.manufacturer);
		System.out.println("Type is: "+sanitizerObj.type);
		System.out.println("Quantity is: "+sanitizerObj.quantity);
		System.out.println("Alcohol Content is: "+sanitizerObj.alcoholContent);
		System.out.println("Fragrance is: "+sanitizerObj.fragrance);
		System.out.println("Expiry is: "+sanitizerObj.expiry);
	}
}