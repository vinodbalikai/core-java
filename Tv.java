class Tv{
	static boolean isOn;
	static int currentVolume;
	static int maxVolume=8;
	static int minVolume;
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
	public static void increaseVolume(){
		System.out.println("The increaseVolume method is called");
		System.out.println("The number of arguments passed are: 0");
		if(isOn==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The current Volume is: "+currentVolume);
		}else{
			System.out.println("The Volume Reached the maximun value");
		}
		}else{
			System.out.println("Gand ka ilaj ho sakta he,Gandu ka nahi");
		}
	}
	public static void decreaseVolume(){
		System.out.println("The decreaseVolume method is called");
		System.out.println("The number of arguments passed here are: 0");
		if(isOn==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current Volume is: "+currentVolume);
			}else{
				System.out.println("The volume reached minimum value");
			}
		}else{
			System.out.println("Gand ka ilaj ho sakta he,Gandu ka nahi");
		}
	}

}
