import java.util.Scanner;

public class BankLogin {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Account acc;
		long accno;
		int choice = 0;
		do{
			System.out.println("\n           Welcome to Busy Bank            ");
			System.out.println("\nMENU\n1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Check Balance\n5. Get Statement of Transactions\n6. Money transfer from one account to another account\n7. Exit\nEnter Your Choice");
			choice = sc.nextInt();
			Account acc1;
			switch(choice){

				case 1: 
					System.out.println("Enter the name");
					String name = sc.next();
					System.out.println("Enter the age");
					int age = sc.nextInt();
					System.out.println("Enter the mobile");
					long mobile = sc.nextLong();
					
					acc = new Account(name,age,mobile);
					System.out.println("Your account number is "+acc.getAccountNumber()+"..\nPlease add the four digit pin for your account");
						int pin = sc.nextInt();
						if(pin > 9999 || pin < 1000){
							System.out.println("Account creation Failed due to wrong pin. Please try again");
							Account.accounts.remove(acc);
						}
						else{
							acc.setPin(pin);
							System.out.println("Account Created Successfully !!");
						}
						DatabaseAction.addAccount(acc.getName(),acc.getAge(),acc.getMobile(),acc.getPin());
					break;

				case 2: 
					long accno1=sc.nextLong();
					
					acc = DatabaseAction.getAccountObject(accno1);
					if(acc != null){
						System.out.println("Enter the amount to deposit");
						long amount = sc.nextLong();
						DatabaseAction.deposit(accno1, amount);
					}
					break;
				case 3: 
					long ac=sc.nextLong();

					int pins=sc.nextInt();
					acc = DatabaseAction.getAccountObject(ac);
					if(acc != null && DatabaseAction.validatePin(ac, pins)){
						
						System.out.println("Enter the amount to withdraw");
                                                long amount = sc.nextLong();
                                                DatabaseAction.withdraw(ac, amount);
					}
					break;
				case 4: 
					long accno2=sc.nextLong();
					int piNo=sc.nextInt();
					acc = DatabaseAction.getAccountObject(accno2);
                        if(acc != null && DatabaseAction.validatePin(accno2, piNo)){

						System.out.println("Hi, Your current balance for the account "+acc.getAccountNumber()+" is "+acc.getBalance());
					}
					break;
				case 5: 
					long accno3=sc.nextLong();
					int pino=sc.nextInt();
					acc = DatabaseAction.getAccountObject(accno3);
                        if(acc != null && DatabaseAction.validatePin(accno3, pino)){

						DatabaseAction.getStatement(accno3);
					}
					break;
				case 6:
					long act=sc.nextLong();
					long accno4=sc.nextLong();

					acc = DatabaseAction.getAccountObject(act);
					acc1= DatabaseAction.getAccountObject(accno4);
					System.out.println("Enter the amount to transfer from your account ");
					long amount=sc.nextLong();
					DatabaseAction.moneyTransfer(act, accno4, amount);
					break;
					
					
				case 7: System.out.println(" THANK YOU !!!");
					System.exit(0);
					
				default :
					System.out.println("Enter a valid choice ");
					break;

			}

		}while(choice <= 7);
		sc.close();
	}

}
