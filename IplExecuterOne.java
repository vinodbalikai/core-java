class IplExecuterOne{
	public static void main(String[] game){
		Team team =new Team();
		team.teamName="RCB";
		team.teamState="Karnataka";
		team.teamSize=15;
		team.teamValueInCr=16706.00;
		team.teamCaptain="Virat Kohli";
		
		Ipl ipl=new Ipl();
		ipl.team=team;
		ipl.iplId=17;
		
		ipl.getIplDetails();
		
		
	}
}