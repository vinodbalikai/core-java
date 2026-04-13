class Pvr{
	int pvrId;
	Screen screen;
	
	public boolean creatScreen(int pvrId,Screen screen){
		boolean isScreenCreated=false;
		this.pvrId=pvrId;
		this.screen=screen;
		isScreenCreated=true;
		return isScreenCreated;
	}
	Pvr(){
		
	}
	
	public Pvr(int pvrId,Screen screen){
		this.pvrId=pvrId;
		this.screen=screen;
	}
	
	public void getPvrDetails(){
		System.out.println("The PVR id is: "+pvrId);
		System.out.println("The screen name is: "+screen.screenName);
		System.out.println("The screen type is: "+screen.screenType);
		System.out.println("The seating capacity is: "+screen.seatingCapacity);
		System.out.println("The screen size is: "+screen.screenSize);
		System.out.println("The ticket price is: "+screen.ticketPrice);
	}
}






