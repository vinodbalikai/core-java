class TicketBooking{
	public static String ticket(String username){
	     System.out.println("Ticket booked by:");
		 return username;
		}
	public static String[] ticket(String username, int seat){
	     System.out.println("The number of seat"+","+"booked by" );
		 String[] details={username, String.valueOf(seat)};
		 for(String detail:details)
		       System.out.println(detail);
		   return details;
}
}