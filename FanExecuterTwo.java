class FanExecuterTwo{
	public static void main(String[] game){
		Capacitor capacitor =new Capacitor();
		capacitor.capacitorType="Ceramic capacitor";
		capacitor.capacitorBrand="Crompton";
		capacitor.capacitorCapacity=4;
		capacitor.capacitorVoltage=230.00;
		capacitor.capacitorCost=100.00;
		
		Fan fan=new Fan(45,capacitor);
		
		fan.getFanDetails();
	}
}