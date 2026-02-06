class TheCult{
	public static void main(String[] args){
		String gymName="The Cult Gym";
		String gymOwnerName="Mukesh Bansal";
		String addressOfGym="Chandra Layout";
		String gymTrainers[]={"Pratham","Rakshit","Sagar"};
		String gymBranches[]={"Rajajinagar Cult Gym","Banashankari Cult Gym","Jayanagar Cult Gym"};
		String gymFees[]={"9500 for 3 months","13000 for 6 months","17000 fir 12 months"};
		
		System.out.println("The name of the Gym is: "+gymName);
		System.out.println("The owner of the Gym is: "+gymOwnerName);
		System.out.println("The address of the Gym is: "+addressOfGym);
		System.out.println("The Trainers of the Gym are");
		for(String gymTrainer:gymTrainers)System.out.println(gymTrainer);
		System.out.println(" ");
		System.out.println("The Branches of the Gym are");
		for(String gymBranche:gymBranches)System.out.println(gymBranche);
		System.out.println(" ");
		System.out.println("The Fees of the Gym are");
		for(String gymFee:gymFees)System.out.println(gymFee);
	}
}