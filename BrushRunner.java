class BrushRunner{
	public static void main(String [] item){
		Brush brush=new Brush("Colgate","Tooth","Blue","Plastic","Teeth","Rectangle");
		System.out.println(brush.brand);
		System.out.println(brush.type);
		System.out.println(brush.colour);
		System.out.println(brush.material);
		System.out.println(brush.usage);
		System.out.println(brush.shape);
		
		Brush brush1=new Brush(5,50,30);
		System.out.println(brush1.size);
		System.out.println(brush1.price);
		System.out.println(brush1.weight);
		
		Brush brush2=new Brush(true,true,false);
		System.out.println(brush2.isSoft);
		System.out.println(brush2.hasGrip);
		System.out.println(brush2.isElectric);
		
	}
}