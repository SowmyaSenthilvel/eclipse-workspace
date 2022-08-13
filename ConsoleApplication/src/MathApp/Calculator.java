
package MathApp;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	static String userValues = "";
	static int mathResult = 0;

	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println("--------- Welcome to the Math world... -----------");
		System.out.println("You are given a four values and four operators..!!");
		System.out.println("--------- Have fun and call the math... ----------");
		System.out.println("--------------------------------------------------");

		displayManageEngine();
	}

	private static void displayManageEngine() {
		int totalValuesCount = 0;

		while (true) {
			System.out.println("0. Exit...");
			System.out.println("1. Four values --> 1 2 3 4");
			System.out.println("2. Four Operators --> + - x /");

			System.out.print("Choose the displayed option: ");
			int userChoice = scanner.nextInt();

			if (userChoice == 0) {
				break;
			} else if (userChoice == 1 || userChoice == 2) {
				doMath(totalValuesCount, userChoice);
			} else {
				System.out.println("Invalid manage engine choice...");
				displayManageEngine();
			}
		}
	}

	private static void doMath(int totalValuesCount, int userChoice) {
		if (userChoice == 1) {
			if (totalValuesCount == 4) {
				System.out.println("No numbers are there...");
				System.out.println("Can't add numbers for math operations...");
				reverseProcess(totalValuesCount);
			} else {
				System.out.print("Enter the value: ");
				char userValue = scanner.next().charAt(0);
				boolean userValueCheck = true;

				for (int i = 0; i < userValues.length(); i++) {
					if (userValue == userValues.charAt(i)) {
						userValueCheck = false;
						break;
					}
				}

				if (userValueCheck) {
					userValues += userValue;
					doCalculation(userValue);
				} else {
					System.out.println("The requested value is not available...");
					System.out.println("Try other values (or) get this value back...");
					String userValueDecision = scanner.nextLine().toLowerCase();

					if (userValueDecision.equals("other")) {
						doMath(totalValuesCount, userChoice);
					} else {
						reverseProcess(totalValuesCount);
					}
				}
			}
		} else if (userChoice == 2) {
			System.out.print("1. Remove operators...");
			System.out.print("2. Add operators...");

			System.out.println("Enter the operator decision choice: ");
			int operatorDecisionChoice = scanner.nextInt();

			if (operatorDecisionChoice == 1) {
				reverseProcess();
			} else {
				System.out.print("Enter the operator: ");
				userValues += scanner.next().charAt(0);
			}
		} else {
			System.out.println("Invalid manage engine choice...");
		}
	}

	private static void doCalculation(char userValue) {
		for (int i = 0; i < userValues.length(); i++) {
			//
		}

		System.out.println("The math result is: " + mathResult);
	}

	private static void reverseProcess() {
		String modifiedUserValue = "";

		System.out.print("Enter the operator to remove...");
		char operatorToRemove = scanner.next().charAt(0);

		for (int i = 0; i < userValues.length(); i++) {
			if (userValues.charAt(i) != operatorToRemove) {
				modifiedUserValue += userValues.charAt(i);
			}
		}

		userValues = modifiedUserValue;
	}

	private static void reverseProcess(int totalValuesCount) {
		String modifiedUserValue = "";

		System.out.print("Enter the value to remove: ");
		char userValueToRemove = scanner.next().charAt(0);

		for (int i = 0; i < userValues.length(); i++) {
			if (userValues.charAt(i) != userValueToRemove) {
				modifiedUserValue += userValues.charAt(i);
			}
		}

		userValues = modifiedUserValue;
		--totalValuesCount;
	}
}