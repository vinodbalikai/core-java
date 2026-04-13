class PvrExecuterTwo{
	public static void main(String[] game){
		Screen screen =new Screen();
		screen.screenName="Screen 2";
		screen.screenType="4DX";
		screen.seatingCapacity=150;
		screen.screenSize=60.00;
		screen.ticketPrice=400.00;
		
		Pvr pvr=new Pvr(45,screen);
		
		pvr.getPvrDetails();
	}
}