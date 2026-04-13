class IcecreamExecuterTwo{
	public static void main(String[] eat){
		IcecreamFlavour icecreamFlavour = new IcecreamFlavour();
		icecreamFlavour.icecreamId=18;
		icecreamFlavour.flavour="Vanila";
		icecreamFlavour.price=50.00;
		icecreamFlavour.noOfScoops=3;
		
		Icecream icecream=new Icecream();
		icecream.icecreamShop="Amul";
		icecream.icecreamFlavour=icecreamFlavour;
		icecream.getIcecreamDetails();
	}
}