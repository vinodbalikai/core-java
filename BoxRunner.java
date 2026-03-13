class BoxRunner{
	public static void main(String [] item){
		Box box=new Box("Tupperware","Storage","Blue","Plastic","Rectangle","Kitchen");
		System.out.println(box.brand);
		System.out.println(box.type);
		System.out.println(box.colour);
		System.out.println(box.material);
		System.out.println(box.shape);
		System.out.println(box.usage);
		
		Box box1=new Box(10,600,500);
		System.out.println(box1.size);
		System.out.println(box1.price);
		System.out.println(box1.weight);
		
		Box box2=new Box(true,true,true);
		System.out.println(box2.isPlastic);
		System.out.println(box2.hasLid);
		System.out.println(box2.isTransparent);
		
	}
}