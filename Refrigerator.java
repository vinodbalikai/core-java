class Refrigerator{
	static boolean isCooling;
	static int currentTemperature;
	static int maxLevel=5;
	static int minLevel;
	static boolean onOrOf(){
		if(isCooling==false){
			isCooling=true;
			System.out.println("The Refrigerator is On");
		}else if(isCooling==true){
			isCooling=false;
			System.out.println("The Refrigerator is Off");
		}
		return isCooling;
	}
	static void increaseTemperature(){
		System.out.println("The increaseTemperature method is invoked");
		if(isCooling==true){
			if(currentTemperature<maxLevel){
				currentTemperature=currentTemperature+1;
				System.out.println("The current Temperature is: "+currentTemperature);
			}else{
				System.out.println("Maximum Cooling reached");
			}
		}else{
			System.out.println("First turn On the Refrigerator");
		}
	}
	static void decreaseTemperature(){
		System.out.println("The decreaseTemperature method is invoked");
		if(isCooling==true){
			if(currentTemperature>minLevel){
				currentTemperature=currentTemperature-1;
				System.out.println("The current Temperature is: "+currentTemperature);
			}else{
				System.out.println("Minimum Cooling reached");
			}
		}else{
			System.out.println("First turn On the Refrigerator");
		}
	}
}
