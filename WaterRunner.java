class WaterRunner{
	public static void main(String [] liquid){
		Water water=new Water("Mineral","Clear","Spring","Fresh","Bottle");
		System.out.println(water.type);
		System.out.println(water.colour);
		System.out.println(water.source);
		System.out.println(water.taste);
		System.out.println(water.container);
		
		Water water3=new Water(1000,"Bisleri",true);
		System.out.println(water3.quantity);
		System.out.println(water3.brand);
		System.out.println(water3.isDrinkable);
		
		Water water1=new Water(7,25);
		System.out.println(water1.phLevel);
		System.out.println(water1.temperature);
		
		Water water2=new Water(true,true);
		System.out.println(water2.isFiltered);
		System.out.println(water2.hasMinerals);
		
	}
}