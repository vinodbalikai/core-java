class StairsRunner{
	public static void main(String [] structure){
		Stairs stairs=new Stairs("Local","Indoor","Grey","Steel","Modern","Matte");
		System.out.println(stairs.brand);
		System.out.println(stairs.type);
		System.out.println(stairs.colour);
		System.out.println(stairs.material);
		System.out.println(stairs.design);
		System.out.println(stairs.finish);
		
		Stairs stairs1=new Stairs(15,300,200);
		System.out.println(stairs1.steps);
		System.out.println(stairs1.height);
		System.out.println(stairs1.weight);
		
		Stairs stairs2=new Stairs(true,true,false);
		System.out.println(stairs2.isSteel);
		System.out.println(stairs2.hasRailing);
		System.out.println(stairs2.isSpiral);
		
	}
}