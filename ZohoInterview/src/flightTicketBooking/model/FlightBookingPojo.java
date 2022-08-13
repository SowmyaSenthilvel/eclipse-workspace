package flightTicketBooking.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FlightBookingPojo {
	public static List<FlightBookingPojo> flightlist=new ArrayList<FlightBookingPojo>();
	public static int FlightID=10001;
	int BookingCost;
	String Category;
	int buisenessSeats=6;
	int economySeats=12;
	int NumberOfSeats=18;
	String TypeOfSeat;
	
	public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		FlightID = flightID;
	}
	public FlightBookingPojo(int FlightID ,int bookingCost, String category, int numberOfSeats, String typeOfSeat,int buisenessSeats,int economySeats) {
		this.FlightID=FlightID++;
		BookingCost = bookingCost;
		Category = category;
		NumberOfSeats = numberOfSeats--;
		TypeOfSeat = typeOfSeat;
		flightlist.add(this);
		
	}
public FlightBookingPojo() {
		super();
	}
	public int getBookingCost() {
		return BookingCost;
	}
	public void setBookingCost(int bookingCost) {
		BookingCost = bookingCost;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public String getTypeOfSeat() {
		return TypeOfSeat;
	}
	public void setTypeOfSeat(String typeOfSeat) {
		TypeOfSeat = typeOfSeat;
	}
	public int getBuisenessSeats() {
		return buisenessSeats;
	}
	public void setBuisenessSeats(int buisenessSeats) {
		this.buisenessSeats = buisenessSeats;
	}
	public int getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	
	
	

}
