package taxibooking;

import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Z-Taxi Booking");
		while(true) {
			
			System.out.println("1.Book Taxi");
			System.out.println("2.Cancel Taxi");
			System.out.println("3.Booking Summary");
			System.out.println("4.Exit");
			System.out.println("Enter the user Choice");
			byte choice=input.nextByte();
			switch(choice) {
				case 1:
					booktaxi();
					break;
			}
			
		}
	}

	private static void booktaxi() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of members you want to book");
		int numberofMembers=input.nextInt();
		if(numberofMembers<=4) {
			System.out.println("Hitachi");
			System.out.println("Sedan");
			System.out.println("Enter your choice");
			String choice=input.next();
			chooseDestination(choice);
		}
		
	}

	private static void chooseDestination(String choice) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the pickup point");
		String pickup=input.next();
		System.out.println("Munar");
		System.out.println("Tuty");
		System.out.println("Banglore");
		System.out.println("Enter a destination");
		byte dest=input.nextByte();
		calculateFare(dest);
		
		
		
		
	}

	private static void calculateFare(byte dest) {
		if(dest==1) {
			System.out.println();
			
		}
		
	}

}
