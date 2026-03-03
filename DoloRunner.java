class DoloRunner{
	public static void main(String [] dolo){
		Dolo doloObj = new Dolo();
		doloObj.tabletName="Dolo 650";
		doloObj.price=30;
		doloObj.manufacturer="Micro Labs";
		doloObj.composition="Paracetamol";
		doloObj.useFor="Fever";
		doloObj.dosage="Twice a day";
		doloObj.expiry="36 Months";
		doloObj.type="Tablet";
		System.out.println("Tablet Name is: "+doloObj.tabletName);
		System.out.println("Price is: "+doloObj.price);
		System.out.println("Manufacturer is: "+doloObj.manufacturer);
		System.out.println("Composition is: "+doloObj.composition);
		System.out.println("Used for: "+doloObj.useFor);
		System.out.println("Dosage is: "+doloObj.dosage);
		System.out.println("Expiry is: "+doloObj.expiry);
		System.out.println("Type is: "+doloObj.type);
	}
}