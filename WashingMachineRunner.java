class WashingMachineRunner{
	public static void main(String [] wm){
		boolean status=WashingMachine.onOrOf();
		WashingMachine.increaseWashLevel();
		System.out.println(" ");
		WashingMachine.increaseWashLevel();
		System.out.println(" ");
		WashingMachine.decreaseWashLevel();
		System.out.println(" ");
		WashingMachine.decreaseWashLevel();
		System.out.println(" ");
	}
}
