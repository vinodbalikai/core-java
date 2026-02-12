class Laptop{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The laptop is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The laptop is OFF");
		}
		return isOn;
	}
}
