class FanExecuterOne{
	public static void main(String[] game){
		Capacitor capacitor =new Capacitor();
		capacitor.capacitorType="Variable Capacitors";
		capacitor.capacitorBrand="Usha";
		capacitor.capacitorCapacity=5;
		capacitor.capacitorVoltage=440.00;
		capacitor.capacitorCost=120.00;
		
		Fan fan=new Fan();
		fan.capacitor=capacitor;
		fan.fanId=17;
		
		fan.getFanDetails();
	}
}