class AC{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The AC is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The AC is OFF");
		}
		return isOn;
	}
}
