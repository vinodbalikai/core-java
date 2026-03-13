class BikeRunner{
	public static void main(String [] vehicle){
		Bike bike=new Bike("Harley","Cruiser","Black","440","150","LED");
		System.out.println(bike.brand);
		System.out.println(bike.type);
		System.out.println(bike.colour);
		System.out.println(bike.cc);
		System.out.println(bike.topSpeed);
		System.out.println(bike.light);
		
		Bike bike1=new Bike(190,27,39);
		System.out.println(bike1.weight);
		System.out.println(bike1.bhp);
		System.out.println(bike1.torque);
		
		Bike bike2=new Bike(false,true,false);
		System.out.println(bike2.isTuned);
		System.out.println(bike2.hasABS);
		System.out.println(bike2.hasTC);
		
	}
}