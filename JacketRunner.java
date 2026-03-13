class JacketRunner{
	public static void main(String [] cloth){
		Jacket jacket=new Jacket("Puma","Winter","Black","Leather","Casual","Winter");
		System.out.println(jacket.brand);
		System.out.println(jacket.type);
		System.out.println(jacket.colour);
		System.out.println(jacket.material);
		System.out.println(jacket.style);
		System.out.println(jacket.season);
		
		Jacket jacket1=new Jacket(40,3500,900);
		System.out.println(jacket1.size);
		System.out.println(jacket1.price);
		System.out.println(jacket1.weight);
		
		Jacket jacket2=new Jacket(true,true,true);
		System.out.println(jacket2.isWaterproof);
		System.out.println(jacket2.hasHood);
		System.out.println(jacket2.hasZip);
		
	}
}