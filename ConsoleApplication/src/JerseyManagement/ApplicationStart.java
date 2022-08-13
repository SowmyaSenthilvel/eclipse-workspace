package JerseyManagement;

import java.util.Scanner;

public class ApplicationStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean AppEnd = true;
		while (AppEnd) {
			System.out.println("\t Welcome To Login Page");
			System.out.println();
			System.out.println("Enter your choice ");
			System.out.println();
			System.out.println("1 for Login");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				new Login().loginpage();
				break;

			case 2:
				System.out.println("    Thank You    ");
				AppEnd = false;
				break;
			default:
				System.out.println();
				System.out.println("Enter a valid Choice");
				break;
			}
		}

	}

}
