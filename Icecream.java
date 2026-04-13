class Icecream{
	String icecreamShop;
	IcecreamFlavour icecreamFlavour;
	
	public boolean selectFlavour(String icecreamShop,IcecreamFlavour icecreamFlavour){
		boolean isFlavourCreated=false;
		this.icecreamFlavour=icecreamFlavour;
		this.icecreamShop=icecreamShop;

		isFlavourCreated=true;
		return isFlavourCreated;
	}
	
	public Icecream(String icecreamShop,IcecreamFlavour icecreamFlavour){
		this.icecreamShop=icecreamShop;
		this.icecreamFlavour=icecreamFlavour;
	}
	
	Icecream(){
		
	}
	
	public void getIcecreamDetails(){
		System.out.println("The name of the icecream shop is: "+icecreamShop);
		System.out.println("The icecream Id is: "+icecreamFlavour.icecreamId);
		System.out.println("The flavour of the icecream is: "+icecreamFlavour.flavour);
		System.out.println("The price of the icecream is: "+icecreamFlavour.price);
		System.out.println("The number of scoops are: "+icecreamFlavour.noOfScoops);
		
	}
	
}