class Speaker{
	static boolean isPlaying;
	static int currentVolume;
	static int maxVolume=10;
	static int minVolume;
	static boolean onOrOf(){
		if(isPlaying==false){
			isPlaying=true;
			System.out.println("The Speaker is On");
		}else if(isPlaying==true){
			isPlaying=false;
			System.out.println("The Speaker is Off");
		}
		return isPlaying;
	}
	static void increaseVolume(){
		System.out.println("The increaseVolume method is invoked");
		if(isPlaying==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The current Volume is: "+currentVolume);
			}else{
				System.out.println("Maximum Volume reached");
			}
		}else{
			System.out.println("First turn On the Speaker");
		}
	}
	static void decreaseVolume(){
		System.out.println("The decreaseVolume method is invoked");
		if(isPlaying==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current Volume is: "+currentVolume);
			}else{
				System.out.println("Minimum Volume reached");
			}
		}else{
			System.out.println("First turn On the Speaker");
		}
	}
}
