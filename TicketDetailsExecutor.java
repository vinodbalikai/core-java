class TicketDetailsExecutor {
    public static void main(String[] args) {

        TicketDetails ticket = new TicketDetails();

        ticket.setTicketNumber("IR521");
        System.out.println("Ticket Number: " + ticket.getTicketNumber());

        ticket.setPassengerName("Vinod");
        System.out.println("Passenger Name: " + ticket.getPassengerName());

        ticket.setSource("Bangalore");
        System.out.println("Source: " + ticket.getSource());

        ticket.setDestination("Belagavi");
        System.out.println("Destination: " + ticket.getDestination());

        ticket.setTravelDate("12-May");
        System.out.println("Travel Date: " + ticket.getTravelDate());

        ticket.setTicketPrice(865.50);
        System.out.println("Ticket Price: " + ticket.getTicketPrice());

        ticket.setCoachType("Sleeper");
        System.out.println("Coach Type: " + ticket.getCoachType());


        TicketDetails ticket1 = new TicketDetails();

        ticket1.setTicketNumber("IR908");
        System.out.println("Ticket Number: " + ticket1.getTicketNumber());

        ticket1.setPassengerName("Ankita");
        System.out.println("Passenger Name: " + ticket1.getPassengerName());

        ticket1.setSource("Mysore");
        System.out.println("Source: " + ticket1.getSource());

        ticket1.setDestination("Mangalore");
        System.out.println("Destination: " + ticket1.getDestination());

        ticket1.setTravelDate("18-June");
        System.out.println("Travel Date: " + ticket1.getTravelDate());

        ticket1.setTicketPrice(540.75);
        System.out.println("Ticket Price: " + ticket1.getTicketPrice());

        ticket1.setCoachType("AC");
        System.out.println("Coach Type: " + ticket1.getCoachType());


        TicketDetails ticket2 = new TicketDetails();

        ticket2.setTicketNumber("IR221");
        System.out.println("Ticket Number: " + ticket2.getTicketNumber());

        ticket2.setPassengerName("Butki");
        System.out.println("Passenger Name: " + ticket2.getPassengerName());

        ticket2.setSource("Delhi");
        System.out.println("Source: " + ticket2.getSource());

        ticket2.setDestination("Jaipur");
        System.out.println("Destination: " + ticket2.getDestination());

        ticket2.setTravelDate("03-July");
        System.out.println("Travel Date: " + ticket2.getTravelDate());

        ticket2.setTicketPrice(420.00);
        System.out.println("Ticket Price: " + ticket2.getTicketPrice());

        ticket2.setCoachType("Chair Car");
        System.out.println("Coach Type: " + ticket2.getCoachType());


        TicketDetails ticket3 = new TicketDetails();

        ticket3.setTicketNumber("IR77A");
        System.out.println("Ticket Number: " + ticket3.getTicketNumber());

        ticket3.setPassengerName("Snehit");
        System.out.println("Passenger Name: " + ticket3.getPassengerName());

        ticket3.setSource("Belgaum");
        System.out.println("Source: " + ticket3.getSource());

        ticket3.setDestination("Goa");
        System.out.println("Destination: " + ticket3.getDestination());

        ticket3.setTravelDate("21-Aug");
        System.out.println("Travel Date: " + ticket3.getTravelDate());

        ticket3.setTicketPrice(350.25);
        System.out.println("Ticket Price: " + ticket3.getTicketPrice());

        ticket3.setCoachType("Semi Sleeper");
        System.out.println("Coach Type: " + ticket3.getCoachType());

    }
}