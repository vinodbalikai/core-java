class ShampooRunner{
	public static void main(String [] item){
		Shampoo shampoo=new Shampoo("Dove","Liquid","White","Mild","Dry","Bottle");
		System.out.println(shampoo.brand);
		System.out.println(shampoo.type);
		System.out.println(shampoo.colour);
		System.out.println(shampoo.fragrance);
		System.out.println(shampoo.hairType);
		System.out.println(shampoo.container);
		
		Shampoo shampoo1=new Shampoo(340,350,400);
		System.out.println(shampoo1.quantity);
		System.out.println(shampoo1.price);
		System.out.println(shampoo1.weight);
		
		Shampoo shampoo2=new Shampoo(true,true,false);
		System.out.println(shampoo2.isHerbal);
		System.out.println(shampoo2.hasConditioner);
		System.out.println(shampoo2.isAntiDandruff);
		
	}
}