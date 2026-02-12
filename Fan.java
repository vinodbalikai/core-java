class Fan{
	static boolean isRotating;
	static boolean onOrOf(){
		if(isRotating==false){
			isRotating=true;
			System.out.println("The fan is running");
		}
		else if(isRotating==true){
			isRotating=false;
			System.out.println("The fan is not running");
		}
		return isRotating;
	}
}