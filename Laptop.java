class Laptop{
	static boolean isOn;
	static int currentBrightness;
	static int maxBrightness=5;
	static int minBrightness;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The Laptop is On");
		}else if(isOn==true){
			isOn=false;
			System.out.println("The Laptop is Off");
		}
		return isOn;
	}
	static void increaseBrightness(){
		System.out.println("The increaseBrightness method is invoked");
		if(isOn==true){
			if(currentBrightness<maxBrightness){
				currentBrightness=currentBrightness+1;
				System.out.println("The current Brightness is: "+currentBrightness);
			}else{
				System.out.println("Maximum Brightness reached");
			}
		}else{
			System.out.println("First turn On the Laptop");
		}
	}
	static void decreaseBrightness(){
		System.out.println("The decreaseBrightness method is invoked");
		if(isOn==true){
			if(currentBrightness>minBrightness){
				currentBrightness=currentBrightness-1;
				System.out.println("The current Brightness is: "+currentBrightness);
			}else{
				System.out.println("Minimum Brightness reached");
			}
		}else{
			System.out.println("First turn On the Laptop");
		}
	}
}
