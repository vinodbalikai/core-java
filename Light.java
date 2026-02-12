class Light{
	static boolean isOn;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The light is ON");
		}
		else if(isOn==true){
			isOn=false;
			System.out.println("The light is OFF");
		}
		return isOn;
	}
}

