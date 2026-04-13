class FanExecuterThree{
	public static void main(String[] game){
		Capacitor capacitor =new Capacitor();
		capacitor.capacitorType=" Film Capacitor";
		capacitor.capacitorBrand="Havells";
		capacitor.capacitorCapacity=3;
		capacitor.capacitorVoltage=220.00;
		capacitor.capacitorCost=90.00;
		
		Fan fan=new Fan();
		boolean isCapacitorCreated=fan.creatCapacitor(11,capacitor);
		System.out.println("The Fan capacitor created: "+isCapacitorCreated);
		
		fan.getFanDetails();
	}
}