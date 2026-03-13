class LampRunner{
	public static void main(String [] item){
		Lamp lamp=new Lamp("Philips","Table","White","Plastic","Round","Warm");
		System.out.println(lamp.brand);
		System.out.println(lamp.type);
		System.out.println(lamp.colour);
		System.out.println(lamp.material);
		System.out.println(lamp.shape);
		System.out.println(lamp.lightType);
		
		Lamp lamp1=new Lamp(9,600,300);
		System.out.println(lamp1.watt);
		System.out.println(lamp1.price);
		System.out.println(lamp1.weight);
		
		Lamp lamp2=new Lamp(true,true,false);
		System.out.println(lamp2.isLED);
		System.out.println(lamp2.hasSwitch);
		System.out.println(lamp2.isRechargeable);
		
	}
}