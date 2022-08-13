package taxiBooking;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	static int taxicount=0;
	int id;
	boolean booked;
	char currentSpot;
	int freeTime;
	int totalEarnings;
	List<String> trips;
	
	public Taxi() {
		booked=false;
		currentSpot ='A';
		freeTime=6;
		totalEarnings=0;
		trips=new ArrayList<String>();
		taxicount=taxicount+1;//everytime new taxi is allotted a new id is created
		id=taxicount;
		
	}

	public void setDetails( boolean booked, char currentSpot, int freeTime, int totalEarnings, String tripsDetails) {
		this.booked = booked;
		this.currentSpot = currentSpot;
		this.freeTime = freeTime;
		this.totalEarnings = totalEarnings;
		this.trips.add(tripsDetails);
	}
	
	//print all trip details
	public void printDetails() {
		System.out.println("Taxi - "+this.id+"Total Earnings - "+this.totalEarnings);
		System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
		for(String trip: trips) {
			System.out.println(id+"         "+trip);
		}
		 System.out.println("--------------------------------------------------------------------------------------");
		
	}
	public void printTaxiDetails() {
		System.out.println();
		System.out.println("Taxi - "+this.id+ "Total Earnings - "+this.totalEarnings +"Current Spot -"+this.currentSpot+"Free Time "+this.freeTime);
		System.out.println();
	}
	

}
//Question
/*
The are 6 points(A,B,C,D,E,F) 15 KM apart 60 min travel between each, n taxis all taxis at A starting
100 rs for first 5 KM and then 10 for each of the further KMs, rate from pickup to drop only
pickup time example : 9 hrs, 15 hrs
When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
-If two taxi’s are free at the same point, one with lower earning is allocated
-If no taxi is free at that time, booking is rejected
Input 1:
Customer ID: 1
Pickup Point: A
Drop Point: B
Pickup Time: 9
Output 1:
Taxi can be allotted.
Taxi-1 is allotted
*/