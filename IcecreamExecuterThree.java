class IcecreamExecuterThree{
	public static void main(String[] eat){
		IcecreamFlavour icecreamFlavour=new IcecreamFlavour();
		icecreamFlavour.icecreamId=21;
		icecreamFlavour.flavour="Blueberry";
		icecreamFlavour.price=65.00;
		icecreamFlavour.noOfScoops=2;
		
		Icecream icecream=new Icecream("Polar Bear",icecreamFlavour);
		icecream.getIcecreamDetails();
	}
}