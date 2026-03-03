class MysoreSandalSoapRunner{
	public static void main(String [] soap){
		MysoreSandalSoap soapObj = new MysoreSandalSoap();
		soapObj.brand="Mysore Sandal Soap";
		soapObj.price=40;
		soapObj.manufacturer="KSDL";
		soapObj.fragrance="Sandalwood";
		soapObj.color="Cream";
		soapObj.weight="125g";
		soapObj.ingredient="Sandal Oil";
		soapObj.expiry="24 Months";
		System.out.println("Brand is: "+soapObj.brand);
		System.out.println("Price is: "+soapObj.price);
		System.out.println("Manufacturer is: "+soapObj.manufacturer);
		System.out.println("Fragrance is: "+soapObj.fragrance);
		System.out.println("Color is: "+soapObj.color);
		System.out.println("Weight is: "+soapObj.weight);
		System.out.println("Main Ingredient is: "+soapObj.ingredient);
		System.out.println("Expiry is: "+soapObj.expiry);
	}
}