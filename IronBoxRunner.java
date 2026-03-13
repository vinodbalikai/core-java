class IronBoxRunner{
	public static void main(String [] item){
		IronBox ironbox=new IronBox("Philips","Dry","White","Plastic","Ceramic","360Cord");
		System.out.println(ironbox.brand);
		System.out.println(ironbox.type);
		System.out.println(ironbox.colour);
		System.out.println(ironbox.material);
		System.out.println(ironbox.plateType);
		System.out.println(ironbox.cordType);
		
		IronBox ironbox1=new IronBox(1000,1200,900);
		System.out.println(ironbox1.watt);
		System.out.println(ironbox1.price);
		System.out.println(ironbox1.weight);
		
		IronBox ironbox2=new IronBox(true,true,true);
		System.out.println(ironbox2.isSteam);
		System.out.println(ironbox2.hasTempControl);
		System.out.println(ironbox2.isNonStick);
		
	}
}