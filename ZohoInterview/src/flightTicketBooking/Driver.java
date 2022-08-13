package flightTicketBooking;

import java.util.Scanner;

import flightTicketBooking.contoller.BookTickets;
import flightTicketBooking.contoller.Login;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Welcome to Z-Flight Ticket Booking");
		manageEngine();
		

	}

	private static void manageEngine() {
		Scanner input=new Scanner(System.in);
		boolean isExit=true;
		while(isExit) {
			System.out.println();
			System.out.println("1.User Registration");
			System.out.println("2.Book Ticket");
			System.out.println("3.Cancel Ticket");
			System.out.println("4.Avaliable Seats");
			System.out.println("5.Exit ");
			int choice=input.nextInt();
			switch(choice) {
				case 1:
					new Login().signUp();
					break;
				case 2:
					new BookTickets().booktickets();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					isExit=false;
					break;
				default:
					System.out.println("Enter a valid choice");
				     break;
				
			
			}
			
		}
		
	}

}
