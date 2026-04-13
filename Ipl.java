class Ipl{
	int iplId;
	Team team;
	
	public boolean creatTeam(int iplId,Team team){
		boolean isTeamCreated=false;
		this.iplId=iplId;
		this.team=team;
		isTeamCreated=true;
		return isTeamCreated;
	}
	Ipl(){
		
	}
	
	public Ipl(int iplId,Team team){
		this.iplId=iplId;
		this.team=team;
	}
	
	public void getIplDetails(){
		System.out.println("The Ipl id is: "+iplId);
		System.out.println("The name of the team is: "+team.teamName);
		System.out.println("The state of the team is: "+team.teamState);
		System.out.println("The size of the team is: "+team.teamSize);
		System.out.println("The value of the team in Cr is: "+team.teamValueInCr);
		System.out.println("The captain of the team is: "+team.teamCaptain);
	}
}