class PvrExecuterThree{
	public static void main(String[] game){
		Screen screen =new Screen();
		screen.screenName="Screen 3";
		screen.screenType="Dolby Atmos";
		screen.seatingCapacity=120;
		screen.screenSize=55.00;
		screen.ticketPrice=300.00;
		
		Pvr pvr=new Pvr();
		boolean isScreenCreated=pvr.creatScreen(11,screen);
		System.out.println("The PVR screen created: "+isScreenCreated);
		
		pvr.getPvrDetails();
	}
}