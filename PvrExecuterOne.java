class PvrExecuterOne{
	public static void main(String[] game){
		Screen screen =new Screen();
		screen.screenName="Screen 1";
		screen.screenType="IMAX";
		screen.seatingCapacity=200;
		screen.screenSize=70.00;
		screen.ticketPrice=350.00;
		
		Pvr pvr=new Pvr();
		pvr.screen=screen;
		pvr.pvrId=17;
		
		pvr.getPvrDetails();
	}
}