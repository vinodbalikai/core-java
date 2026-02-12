class Printer{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The printer is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The printer is OFF");
		}
		return isOn;
	}
}
