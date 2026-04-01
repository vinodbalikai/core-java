class TicketDetails {

    private String ticketNumber;
    private String passengerName;
    private String source;
    private String destination;
    private String travelDate;
    private double ticketPrice;
    private String coachType;

    public void setTicketNumber(String ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    public String getTicketNumber(){
        return this.ticketNumber;
    }

    public void setPassengerName(String passengerName){
        this.passengerName = passengerName;
    }
    public String getPassengerName(){
        return this.passengerName;
    }

    public void setSource(String source){
        this.source = source;
    }
    public String getSource(){
        return this.source;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDestination(){
        return this.destination;
    }

    public void setTravelDate(String travelDate){
        this.travelDate = travelDate;
    }
    public String getTravelDate(){
        return this.travelDate;
    }

    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public double getTicketPrice(){
        return this.ticketPrice;
    }

    public void setCoachType(String coachType){
        this.coachType = coachType;
    }
    public String getCoachType(){
        return this.coachType;
    }
}