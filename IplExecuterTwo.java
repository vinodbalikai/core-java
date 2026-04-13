class IplExecuterTwo{
	public static void main(String[] game){
		Team team =new Team();
		team.teamName="MI";
		team.teamState="Maharashtra";
		team.teamSize=15;
		team.teamValueInCr=1500.00;
		team.teamCaptain="Rohit Sharma";
		
		Ipl ipl=new Ipl(45,team);
		
		ipl.getIplDetails();
		
		
	}
}