class RingRunner{
	public static void main(String [] item){
		Ring ring=new Ring("Tanishq","Finger","Gold","Gold","Floral","Round");
		System.out.println(ring.brand);
		System.out.println(ring.type);
		System.out.println(ring.colour);
		System.out.println(ring.material);
		System.out.println(ring.design);
		System.out.println(ring.shape);
		
		Ring ring1=new Ring(18,15000,10);
		System.out.println(ring1.size);
		System.out.println(ring1.price);
		System.out.println(ring1.weight);
		
		Ring ring2=new Ring(true,true,false);
		System.out.println(ring2.isGold);
		System.out.println(ring2.hasStone);
		System.out.println(ring2.isAdjustable);
		
	}
}