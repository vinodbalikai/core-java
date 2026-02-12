class Fan{
	static boolean isRotating;
	static int currentSpeed;
	static int maxSpeed=5;
	static int minSpeed;
	static boolean onOrOf(){
		if(isRotating==false){
			isRotating=true;
			System.out.println("The Fan is On");
		}else if(isRotating=true){
			isRotating=false;
			System.out.println("The Fan is Off");
		}return isRotating;
	}
	static void increaseSpeed(){
		System.out.println("The increaseSpeed method is invoked");
		System.out.println("The number of parameters passed are: 0");
		if(isRotating==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("The current Speed is: "+currentSpeed);
			}else{
				System.out.println("The Fan reached the maximum Speed");
			}
		}else{
			System.out.println("First turn On the Fan");
		}
	}
	static void decreaseSpeed(){
		System.out.println("The decreaseSpeed method is invoked");
		System.out.println("The number of parameters passed are: 0");
		if(isRotating==true){
			if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("The current Speed of the Fan is: "+currentSpeed);
			}else{
				System.out.println("The Fan reached the minimum speed");
			}
		}else{
			System.out.println("First Turn On the Fan");
		}
	}
	
	
}