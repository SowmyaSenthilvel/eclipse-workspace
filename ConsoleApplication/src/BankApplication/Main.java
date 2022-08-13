package BankApplication;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account acc;
		int choice = 0;
		do {
			System.out.println("\n           Welcome to Busy Bank            ");
			System.out.println(
					"\nMENU\n1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Check Balance\n5. Get Statement of Transactions\n6. Money transfer from one account to another account\n7. Exit\nEnter Your Choice");
			choice = sc.nextInt();
			Account acc1;
			switch (choice) {

			case 1:
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the age");
				int age = sc.nextInt();
				acc = new Account(name, age);
				System.out.println("Your account number is " + acc.getAccountNumber()
						+ "..\nPlease add the four digit pin for your account");
				int pin = sc.nextInt();
				if (pin > 9999 || pin < 1000) {
					System.out.println("Account creation Failed due to wrong pin. Please try again");
					Account.accounts.remove(acc);
				} else {
					acc.setPin(pin);
					System.out.println("Account Created Successfully !!");
				}
				break;

			case 2:
				acc = BankAction.getAccountAndValidate();
				if (acc != null) {
					System.out.println("Enter the amount to deposit");
					long amount = sc.nextLong();
					BankAction.deposit(acc, amount);
				}
				break;
			case 3:
				acc = BankAction.getAccountAndValidate();
				if (acc != null && BankAction.validatePin(acc)) {

					System.out.println("Enter the amount to withdraw");
					long amount = sc.nextLong();
					BankAction.withdraw(acc, amount);
				}
				break;
			case 4:
				acc = BankAction.getAccountAndValidate();
				if (acc != null && BankAction.validatePin(acc)) {

					System.out.println("Hi, Your current balance for the account " + acc.getAccountNumber() + " is "
							+ acc.getBalance());
				}
				break;
			case 5:
				acc = BankAction.getAccountAndValidate();
				if (acc != null && BankAction.validatePin(acc)) {

					BankAction.getStatement(acc);
				}
				break;
			case 6:
				acc = BankAction.getAccountAndValidate();
				acc1 = BankAction.getAccountAndValidate();
				System.out.println("Enter the amount to transfer from your account ");
				long amount = sc.nextLong();
				BankAction.moneyTransfer(acc, acc1, amount);
				break;

			case 7:
				System.out.println(" THANK YOU !!!");
				System.exit(0);

			default:
				System.out.println("Enter a valid choice ");
				break;

			}

		} while (choice <= 7);
		sc.close();
	}

}
