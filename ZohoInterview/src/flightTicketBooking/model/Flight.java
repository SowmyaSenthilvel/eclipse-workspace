package flightTicketBooking.model;

public class Flight {
	public static int id = 0;
    Tickets[] businessclass;
    Tickets[] economyclass;
    Tickets[] tatkalbusinessclass;
    Tickets[] tatkaleconomyclass;
    String source;
    String destination;

    public Flight(String src, String dest){
        
        businessclass = new Tickets[6];
        economyclass = new Tickets[12];
        tatkalbusinessclass = new Tickets[2];
        tatkaleconomyclass = new Tickets[4];
        source = src;
        destination = dest;

        
    }
    
}
