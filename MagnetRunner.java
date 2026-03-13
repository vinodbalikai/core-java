class MagnetRunner{
	public static void main(String [] object){
		Magnet magnet=new Magnet("Local","Neodymium","Silver","NdFeB","Round","Nickel");
		System.out.println(magnet.brand);
		System.out.println(magnet.type);
		System.out.println(magnet.colour);
		System.out.println(magnet.material);
		System.out.println(magnet.shape);
		System.out.println(magnet.coating);
		
		Magnet magnet1=new Magnet(100,500,50);
		System.out.println(magnet1.strength);
		System.out.println(magnet1.price);
		System.out.println(magnet1.weight);
		
		Magnet magnet2=new Magnet(true,false,true);
		System.out.println(magnet2.isPermanent);
		System.out.println(magnet2.isFlexible);
		System.out.println(magnet2.isIndustrial);
		
	}
}