package bookfinder;
import bookfinder.controller.BookRegistration;
import bookfinder.view.ViewBooks;

import java.util.Scanner;

public class Driver {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\tWelcome to great kirikalan magic show");
		manageEngine();
		

	}

	private static void manageEngine() {
		while(true) {
			System.out.println("Enter 1 for addding book");
			System.out.println("Enter 2 for viewing book");
			System.out.println("Enter 3 for removing book");
			System.out.println("Enter 4 for searching book");
			System.out.println("Enter 5 for Exit");
			System.out.println("Enter your choice");
			byte choice=input.nextByte();
			switch(choice) {
			case 1:
				new BookRegistration().addBooks();
				break;
			case 2:
				new ViewBooks().viewbook();
				break;
			case 3:
				new BookRegistration().removeBooks();
				break;
			case 4:
				new BookRegistration().searchBooks();
				break;
			case 5:
				System.exit(0);
				break;
			}
			
		}
		
	}

}
