class Mixer{
	static boolean isGrinding;
	static int currentSpeed;
	static int maxSpeed=5;
	static int minSpeed;
	static boolean onOrOf(){
		if(isGrinding==false){
			isGrinding=true;
			System.out.println("The Mixer is On");
		}else if(isGrinding==true){
			isGrinding=false;
			System.out.println("The Mixer is Off");
		}
		return isGrinding;
	}
	static void increaseSpeed(){
		System.out.println("The increaseSpeed method is invoked");
		if(isGrinding==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("The current Speed is: "+currentSpeed);
			}else{
				System.out.println("Maximum Speed reached");
			}
		}else{
			System.out.println("First turn On the Mixer");
		}
	}
	static void decreaseSpeed(){
		System.out.println("The decreaseSpeed method is invoked");
		if(isGrinding==true){
			if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("The current Speed is: "+currentSpeed);
			}else{
				System.out.println("Minimum Speed reached");
			}
		}else{
			System.out.println("First turn On the Mixer");
		}
	}
}
