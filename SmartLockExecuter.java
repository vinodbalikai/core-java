class SmartLockExecuter{
	public static void main(String [] lock){
		Double price =SmartLock.getPrice();
        System.out.println("The price of the smart lock is: "+price);
		
		String brand=SmartLock.getBrand();
		System.out.println("The brand of the smart lock is: "+brand);
		
		String method=SmartLock.getUnlockMethod();
		System.out.println("Unlock method: "+method);
		
		boolean auto=SmartLock.hasAutoLock();
		System.out.println("Has auto lock: "+auto);
		
		String connectivity=SmartLock.getConnectivity();
		System.out.println("Connectivity: "+connectivity);
		
		int battery=SmartLock.getBatteryLife();
		System.out.println("Battery life: "+battery+" months");
	}
}