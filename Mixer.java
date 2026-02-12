class Mixer{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The mixer is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The mixer is OFF");
		}
		return isOn;
	}
}
