class TubeLightRunner{
	public static void main(String [] item){
		TubeLight tubelight=new TubeLight("Philips","Wall","White","Glass","Cylinder","CoolWhite");
		System.out.println(tubelight.brand);
		System.out.println(tubelight.type);
		System.out.println(tubelight.colour);
		System.out.println(tubelight.material);
		System.out.println(tubelight.shape);
		System.out.println(tubelight.lightType);
		
		TubeLight tubelight1=new TubeLight(20,350,200);
		System.out.println(tubelight1.watt);
		System.out.println(tubelight1.price);
		System.out.println(tubelight1.weight);
		
		TubeLight tubelight2=new TubeLight(true,false,true);
		System.out.println(tubelight2.isLED);
		System.out.println(tubelight2.hasStarter);
		System.out.println(tubelight2.isEnergySaving);
		
	}
}