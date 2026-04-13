class Fan{
	int fanId;
	Capacitor capacitor;
	
	public boolean creatCapacitor(int fanId,Capacitor capacitor){
		boolean isCapacitorCreated=false;
		this.fanId=fanId;
		this.capacitor=capacitor;
		isCapacitorCreated=true;
		return isCapacitorCreated;
	}
	Fan(){
		
	}
	
	public Fan(int fanId,Capacitor capacitor){
		this.fanId=fanId;
		this.capacitor=capacitor;
	}
	
	public void getFanDetails(){
		System.out.println("The Fan id is: "+fanId);
		System.out.println("The type of the capacitor is: "+capacitor.capacitorType);
		System.out.println("The brand of the capacitor is: "+capacitor.capacitorBrand);
		System.out.println("The capacity of the capacitor is: "+capacitor.capacitorCapacity);
		System.out.println("The voltage of the capacitor is: "+capacitor.capacitorVoltage);
		System.out.println("The cost of the capacitor is: "+capacitor.capacitorCost);
	}
}





