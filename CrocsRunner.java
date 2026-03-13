class CrocsRunner{
	public static void main(String [] footwear){
		Crocs crocs=new Crocs("Crocs","Clogs","Blue","Rubber","Foam","Classic");
		System.out.println(crocs.brand);
		System.out.println(crocs.type);
		System.out.println(crocs.colour);
		System.out.println(crocs.material);
		System.out.println(crocs.soleType);
		System.out.println(crocs.pattern);
		
		Crocs crocs1=new Crocs(9,2999,400);
		System.out.println(crocs1.size);
		System.out.println(crocs1.price);
		System.out.println(crocs1.weight);
		
		Crocs crocs2=new Crocs(true,true,true);
		System.out.println(crocs2.isWaterproof);
		System.out.println(crocs2.hasStrap);
		System.out.println(crocs2.hasVentilation);
		
	}
}