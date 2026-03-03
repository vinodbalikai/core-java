class ColinRunner{
	public static void main(String [] colin){
		Colin colinObj = new Colin();
		colinObj.brandName="Colin Cleaner";
		colinObj.price=60;
		colinObj.manufacturer="HUL";
		colinObj.color="Blue";
		colinObj.type="Glass Cleaner";
		colinObj.usage="Cleaning Glass";
		colinObj.quantity="500ml";
		colinObj.expiryDate="12 Months";
		System.out.println("Brand Name is: "+colinObj.brandName);
		System.out.println("Price is: "+colinObj.price);
		System.out.println("Manufacturer is: "+colinObj.manufacturer);
		System.out.println("Color is: "+colinObj.color);
		System.out.println("Type is: "+colinObj.type);
		System.out.println("Usage is: "+colinObj.usage);
		System.out.println("Quantity is: "+colinObj.quantity);
		System.out.println("Expiry is: "+colinObj.expiryDate);
	}
}