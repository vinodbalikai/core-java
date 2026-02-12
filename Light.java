class Light{
	static boolean isOn;
	static int currentIntensity;
	static int maxIntensity=5;
	static int minIntensity;
	//here onOrOf is funcationality of class light
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
	static void increaseIntensity(){
		System.out.println("The increaseIntensity method is called");
		System.out.println("The parameters passed are: 0");
		if(isOn==true){
			if(currentIntensity<maxIntensity){
				currentIntensity=currentIntensity+1;
				System.out.println("The current Intensity is: "+currentIntensity);
			}else{
				System.out.println("The maximum Intensity reached");
			}
		}
		else{
			System.out.println("The Light is Off, you need to first turn it On");
		}
	}
	static void decreaseIntensity(){
		System.out.println("The decreaseIntensity method is called");
		System.out.println("The number of parameters passed are: 0");
		if(isOn==true){
			if(currentIntensity>minIntensity){
				currentIntensity=currentIntensity-1;
				System.out.println("The current Intensity is: "+currentIntensity);
			}else{
				System.out.println("The minimum Intensity is reached ");
			}
			
		}else{
			System.out.println("First you need to turn on the light");
		}
	}
}


