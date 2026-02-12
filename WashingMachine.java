class WashingMachine{
	static boolean isRunning;
	static int currentWashLevel;
	static int maxLevel=5;
	static int minLevel;

	static boolean onOrOf(){
		if(isRunning==false){
			isRunning=true;
			System.out.println("The Washing Machine is On");
		}else if(isRunning==true){
			isRunning=false;
			System.out.println("The Washing Machine is Off");
		}
		return isRunning;
	}

	static void increaseWashLevel(){
		System.out.println("The increaseWashLevel method is invoked");
		if(isRunning==true){
			if(currentWashLevel<maxLevel){
				currentWashLevel=currentWashLevel+1;
				System.out.println("The current Wash Level is: "+currentWashLevel);
			}else{
				System.out.println("Maximum Wash Level reached");
			}
		}else{
			System.out.println("First turn On the Washing Machine");
		}
	}

	static void decreaseWashLevel(){
		System.out.println("The decreaseWashLevel method is invoked");
		if(isRunning==true){
			if(currentWashLevel>minLevel){
				currentWashLevel=currentWashLevel-1;
				System.out.println("The current Wash Level is: "+currentWashLevel);
			}else{
				System.out.println("Minimum Wash Level reached");
			}
		}else{
			System.out.println("First turn On the Washing Machine");
		}
	}
}
