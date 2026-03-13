class SwitchBoardRunner{
	public static void main(String [] electric){
		SwitchBoard switchboard=new SwitchBoard("Anchor","Wall","White","Plastic","Modern","Rectangle");
		System.out.println(switchboard.brand);
		System.out.println(switchboard.type);
		System.out.println(switchboard.colour);
		System.out.println(switchboard.material);
		System.out.println(switchboard.design);
		System.out.println(switchboard.shape);
		
		SwitchBoard switchboard1=new SwitchBoard(6,450,300);
		System.out.println(switchboard1.switches);
		System.out.println(switchboard1.price);
		System.out.println(switchboard1.weight);
		
		SwitchBoard switchboard2=new SwitchBoard(true,true,true);
		System.out.println(switchboard2.hasIndicator);
		System.out.println(switchboard2.isModular);
		System.out.println(switchboard2.hasSocket);
		
	}
}