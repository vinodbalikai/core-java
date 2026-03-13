class DustbinRunner{
	public static void main(String [] item){
		Dustbin dustbin=new Dustbin("Cello","Pedal","Green","Plastic","Round","Home");
		System.out.println(dustbin.brand);
		System.out.println(dustbin.type);
		System.out.println(dustbin.colour);
		System.out.println(dustbin.material);
		System.out.println(dustbin.shape);
		System.out.println(dustbin.usage);
		
		Dustbin dustbin1=new Dustbin(20,450,800);
		System.out.println(dustbin1.capacity);
		System.out.println(dustbin1.price);
		System.out.println(dustbin1.weight);
		
		Dustbin dustbin2=new Dustbin(true,true,true);
		System.out.println(dustbin2.isPlastic);
		System.out.println(dustbin2.hasLid);
		System.out.println(dustbin2.hasPedal);
		
	}
}