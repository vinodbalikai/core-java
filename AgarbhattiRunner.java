class AgarbhattiRunner{
	public static void main(String [] agar){
		Agarbhatti agarObj = new Agarbhatti();
		agarObj.brand="Cycle Pure";
		agarObj.price=50;
		agarObj.fragrance="Rose";
		agarObj.manufacturer="NR Group";
		agarObj.quantity="20 Sticks";
		agarObj.length="8 inch";
		agarObj.useFor="Pooja";
		agarObj.color="Red";
		System.out.println("Brand is: "+agarObj.brand);
		System.out.println("Price is: "+agarObj.price);
		System.out.println("Fragrance is: "+agarObj.fragrance);
		System.out.println("Manufacturer is: "+agarObj.manufacturer);
		System.out.println("Quantity is: "+agarObj.quantity);
		System.out.println("Length is: "+agarObj.length);
		System.out.println("Used for: "+agarObj.useFor);
		System.out.println("Color is: "+agarObj.color);
	}
}