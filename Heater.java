class Heater{
	static boolean isOn;
	static int currentTemperature;
	static int maxTemperature=35;
	static int minTemperature;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The Heater is ON");
		}else if(isOn==true){
			isOn=false;
			System.out.println("The Heater is Off");
		}return isOn;
	}
	static void increaseTemperature(){
		System.out.println("The increaseTemperature method is called");
		System.out.println("The number of parameters passed are: 0");
		if(isOn==true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("The current Temperature is: "+currentTemperature);
			}else{
				System.out.println("The Heater has Reached the maximun Temperature");
			}
		}else{
			System.out.println("The Heater is Off");
		}
	}
	static void decreaseTemperature(){
		System.out.println("The decreaseTemperature method is called");
		System.out.println("The Number of parameters passed are: 0");
		if(isOn==true){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("The current Temperature is: "+currentTemperature);
			}else{
				System.out.println("The Heater has Reached the minimum Temperature");
			}
		}else{
			System.out.println("The Heater is Off");
		}
	}
}