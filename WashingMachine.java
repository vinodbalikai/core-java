class WashingMachine{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The washing machine is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The washing machine is OFF");
		}
		return isOn;
	}
}

