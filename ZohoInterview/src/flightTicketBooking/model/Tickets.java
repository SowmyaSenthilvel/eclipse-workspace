package flightTicketBooking.model;

public class Tickets {
    public static long pnr = 100000000000l;
    User user;
    Flight flight;
    String status;
    
    public Tickets(User user, Flight flight){
        
        this.user = user;
        this.flight = flight;
        this.status = "Reserved";
   
    }

}
