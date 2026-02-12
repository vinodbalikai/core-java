class Heater{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The heater is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The heater is OFF");
		}
		return isOn;
	}
}
