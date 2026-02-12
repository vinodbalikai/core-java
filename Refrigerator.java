class Refrigerator{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The refrigerator is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The refrigerator is OFF");
		}
		return isOn;
	}
}
