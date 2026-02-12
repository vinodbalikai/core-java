class Tv{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The TV is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The TV is OFF");
		}
		return isOn;
	}
}
