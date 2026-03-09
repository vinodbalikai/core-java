class BunExecutor{
 public static void main(String[] args){
	Bun b = new Bun();
	
	String brand = "James";
	b.brand=brand;
	System.out.println("The brand of a bun is:" +b.brand);
	
	String flavor = "Strawberry";
	b.flavor = flavor;
	System.out.println("The flavor of bun is:" +b.flavor);
	
	double price = 15;
	b.price = price;
	System.out.println("The price of single bun is:" +b.price);
	
	double weight= 18;
	b.weight = weight;
	System.out.println("The weight of single bun in grams:" +b.weight);
	
	String shape="Oval";
	b.shape = shape;
	System.out.println("The shape of a bun is:" +b.shape);
	
	boolean fresh= false;
	b.fresh=fresh;
	System.out.println("Status of a bun is:" +b.fresh);
	
	String manufacturer= "GoldenBake";
	b.manufacturer = manufacturer;
	System.out.println("Manufacturer status of bun is:" +b.manufacturer);
	
	String expiryDate="30-04-2026";
	b.expiryDate=expiryDate;
	System.out.println("Expiration date of bun is:" +b.expiryDate);
	
	int quantity = 350;
	b.quantity = quantity;
	System.out.println("The quantity of bun is:" +b.quantity);
	
	String packaging = "Paper Wrap";
	b.packaging = packaging;
	System.out.println("The packaging status of bun is:" +b.packaging);
	
	String[] ingredients = {"Wheat Flour", "Sugar", "Butter", "Milk", "Yeast"};
	System.out.println("The ingredients list of bun is:");
	b.ingredients= ingredients;
	for(String Buns: b.ingredients){
		System.out.println(Buns + " ");
	}
	
	String[] outletNames = {"Indiranagar", "Whitefield", "BTM", "Malleshwaram"};
	System.out.println("The bun outlets in:" );
	b.outletNames=outletNames;
	for(String Buns: b.outletNames){
		System.out.println(Buns + " ");
	}
	
}
}