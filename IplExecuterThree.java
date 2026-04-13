class IplExecuterThree{
	public static void main(String[] game){
		Team team =new Team();
		team.teamName="PBKS";
		team.teamState="Punjab";
		team.teamSize=11;
		team.teamValueInCr=800.00;
		team.teamCaptain="Shreyas Iyer";
		
		Ipl ipl=new Ipl();
		boolean isTeamCreated=ipl.creatTeam(11,team);
		System.out.println("The Ipl team created: "+isTeamCreated);
		
		ipl.getIplDetails();
	}
}