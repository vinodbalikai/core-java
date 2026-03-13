class WoodRunner{
	public static void main(String [] material){
		Wood wood=new Wood("Greenply","Teak","Brown","India","Straight","Polish");
		System.out.println(wood.brand);
		System.out.println(wood.type);
		System.out.println(wood.colour);
		System.out.println(wood.origin);
		System.out.println(wood.grainType);
		System.out.println(wood.finish);
		
		Wood wood1=new Wood(200,5000,25);
		System.out.println(wood1.length);
		System.out.println(wood1.price);
		System.out.println(wood1.weight);
		
		Wood wood2=new Wood(true,true,false);
		System.out.println(wood2.isHardwood);
		System.out.println(wood2.isPolished);
		System.out.println(wood2.isWaterResistant);
		
	}
}