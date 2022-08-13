package flightTicketBooking.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import flightTicketBooking.model.FlightBookingPojo;

public class BookTickets {
	
	int BookingID=1;

	public void booktickets() {
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to Booking Tickets in Z_Flight");
		System.out.println();
		FlightBookingPojo flightpojo=new FlightBookingPojo();
		if(FlightBookingPojo.flightlist.size()>0)
		{
			flightpojo = FlightBookingPojo.flightlist.get(0);
		}
		System.out.println("Select the category (G-General)/(T-Tatkal)");
		flightpojo.setCategory(input.next());
		if(flightpojo.getCategory().equals("G")) {
			System.out.println("Select the Seat Type(Buiseness)/(Economy)");
			flightpojo.setTypeOfSeat(input.next());
			if(flightpojo.getTypeOfSeat().equals("B")) {
				flightpojo.setBookingCost(2000);
				System.out.println("No of seats required ");
				int n=input.nextInt();
				System.out.println(flightpojo.getBuisenessSeats()-n);
				System.out.println(flightpojo.getNumberOfSeats()-n);
				System.out.println("Senior Citizens (Y-Yes,N-No)");
				String seniorCitizen=input.next();
				if(seniorCitizen.equals("Y")) {
					int totalCost=((flightpojo.getBookingCost()*n%10)+(n*200));	
					System.out.println("Total cost is "+totalCost);
				}else {
				int totalCost=((flightpojo.getBookingCost()*n)+(n*200));
				System.out.println("Total cost is "+totalCost);
				}
			}
			else if(flightpojo.getTypeOfSeat().equals("E")){
				flightpojo.setBookingCost(1000);
				System.out.println("No of seats required ");
				int n=input.nextInt();
				System.out.println("Remaining seats "+(flightpojo.getEconomySeats()-n));
				System.out.println("Total remaining seats"+(flightpojo.getNumberOfSeats()-n));
				System.out.println("Senior Citizens (Y-Yes,N-No)");
				String seniorCitizen=input.next();
				if(seniorCitizen.equals("Y")) {
					int totalCost=((flightpojo.getBookingCost()*n%10)+(n*200));
					System.out.println("Total cost is "+totalCost);
				}else {
				int totalCost=((flightpojo.getBookingCost())+(n*200));
				System.out.println("Total cost is "+totalCost);
				}
			}
		}
		else if(flightpojo.getCategory().equals("T")) {
			System.out.println("Select the Seat Type(Buiseness)/(Economy)");
			flightpojo.setTypeOfSeat(input.next());
			if(flightpojo.getTypeOfSeat().equals("B") ){
				flightpojo.setBookingCost(3000);
				System.out.println(flightpojo.getBookingCost());
				System.out.println("No of seats required ");
				int n=input.nextInt();
				System.out.println(flightpojo.getBuisenessSeats()-n);
				System.out.println(flightpojo.getNumberOfSeats()-n);
				System.out.println("Senior Citizens (Y-Yes,N-No)");
				String seniorCitizen=input.next();
				if(seniorCitizen.equals("Y")) {
					int totalCost=((flightpojo.getBookingCost()*n%10)+(n*200));
					System.out.println("Total cost is "+totalCost);
				}else {
				int totalCost=((flightpojo.getBookingCost()*n)+(n*200));
				System.out.println("Total cost is "+totalCost);
				}
			}
			else if(flightpojo.getTypeOfSeat().equals("E")){
				flightpojo.setBookingCost(2000);
				System.out.println("No of seats required ");
				int n=input.nextInt();
				
				System.out.println(flightpojo.getEconomySeats()-n);
				System.out.println(flightpojo.getNumberOfSeats()-n);
				System.out.println("Senior Citizens (Y-Yes,N-No)");
				String seniorCitizen=input.next();
				if(seniorCitizen.equals("Y")) {
					int totalCost=((flightpojo.getBookingCost()*n%10)+(n*200));
					System.out.println("Total cost is "+totalCost);
				}else {
				int totalCost=((flightpojo.getBookingCost()*n)+(n*200));
				System.out.println("Total cost is "+totalCost);
				}
			}
				
		}
		else {
			System.out.println("Select a valid category");
		}
		System.out.println("Your Flight ID " +flightpojo.getFlightID());
		FlightBookingPojo.flightlist.add(flightpojo);
		System.out.println(" Status  Booking Completed "+BookingID++);
		
	
	}

}
