class PillowRunner{
	public static void main(String [] item){
		Pillow pillow=new Pillow("Sleepwell","Cotton","White","Cotton","Rectangle","Fiber");
		System.out.println(pillow.brand);
		System.out.println(pillow.type);
		System.out.println(pillow.colour);
		System.out.println(pillow.material);
		System.out.println(pillow.shape);
		System.out.println(pillow.filling);
		
		Pillow pillow1=new Pillow(20,800,600);
		System.out.println(pillow1.size);
		System.out.println(pillow1.price);
		System.out.println(pillow1.weight);
		
		Pillow pillow2=new Pillow(true,true,true);
		System.out.println(pillow2.isSoft);
		System.out.println(pillow2.hasCover);
		System.out.println(pillow2.isWashable);
		
	}
}