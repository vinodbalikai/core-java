class IcecreamExecuter{
	public static void main(String[] eat){
		IcecreamFlavour icecreamFlavour=new IcecreamFlavour();
		icecreamFlavour.icecreamId=17;
		icecreamFlavour.flavour="Chocolate";
		icecreamFlavour.price=45.00;
		icecreamFlavour.noOfScoops=2;
		
		Icecream icecream=new Icecream();
		boolean isFlavourCreated=icecream.selectFlavour("Baskin Robbins",icecreamFlavour);
		System.out.println("The Icecream flower selected: "+isFlavourCreated);
		icecream.getIcecreamDetails();
	}
}