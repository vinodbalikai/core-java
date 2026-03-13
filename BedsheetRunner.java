class BedsheetRunner{
	public static void main(String [] cloth){
		Bedsheet bedsheet=new Bedsheet("BombayDyeing","Flat","Blue","Cotton","Floral","Printed");
		System.out.println(bedsheet.brand);
		System.out.println(bedsheet.type);
		System.out.println(bedsheet.colour);
		System.out.println(bedsheet.material);
		System.out.println(bedsheet.design);
		System.out.println(bedsheet.pattern);
		
		Bedsheet bedsheet1=new Bedsheet(90,1200,800);
		System.out.println(bedsheet1.size);
		System.out.println(bedsheet1.price);
		System.out.println(bedsheet1.weight);
		
		Bedsheet bedsheet2=new Bedsheet(true,true,true);
		System.out.println(bedsheet2.isCotton);
		System.out.println(bedsheet2.hasPrint);
		System.out.println(bedsheet2.isDoubleBed);
		
	}
}