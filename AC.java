class AC{
	static boolean isOn;
	static int currentTemperature;
	static int maxTemperature=28;
	static int minTemperature;
	static boolean onOrOf(){
		if(isOn==false){
			isOn=true;
			System.out.println("The AC is On");
		}else if (isOn==true){
			isOn=false;
			System.out.println("The AC is Off");
		}return isOn;
	}
	static void increaseTemperature(){
		System.out.println("The increaseTemperature method is called");
		System.out.println("The number of parameters used are: 0");
		if(isOn==true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("The current Temperature is: "+currentTemperature);
		}
		else{
			System.out.println("The AC reached maximun Temperature");
		}
	}else{
		System.out.println("First you need to turn on the AC");
		
	}
}

	static void decreaseTemperature(){
		System.out.println("The decreaseTemperature method is called");;
		System.out.println("The number of parameters passed are: 0");
		if(isOn==true){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("The current Temperature is: "+currentTemperature);
			}
		else{
			System.out.println("The AC reached Minimun temperature");
		}
	}
	else{
		System.out.println("First you need to turn on Your AC");
		}
	}
}