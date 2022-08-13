package FourteGame;

import java.util.Scanner;

public class MathValue {
	Scanner input=new Scanner(System.in);

	public void mathvalue(int choice, int result) {
		String defaultNumber="1, 2, 3, 4";
		int count=0;
		System.out.println("Enter a number to add");
		char number=input.next().charAt(0);
		boolean check=true;
		for(int i=0;i<defaultNumber.length();i++) {
			if(number==defaultNumber.charAt(i)) {
				check=false;
				break;
			}
		
		}
		if(check=true) {
			defaultNumber=defaultNumber+number;
			operation(number);
		}
		else {
		System.out.println("The requested value is not available...");
		System.out.println("Try other values (or) get this value back...");
		String userValueDecision = scanner.nextLine().toLowerCase();

		if (userValueDecision.equals("other")) {
			operation(result, choice);
		} 
		else {
			operationReverse(result);
		}
	}
	}

	private void operation(char number) {
		System.out.print("1. Remove operators...");
        System.out.print("2. Add operators...");

        System.out.println("Enter the operator decision choice: ");
        int operatorChoice = input.nextInt();

        if (operatorChoice == 1) {
            new MathOperator().operationReverse(number);
        } else {
            System.out.print("Enter the operator: ");
            number += input.next().charAt(0);
        }
    } else {
        System.out.println("Invalid choice...");
    }
		
	}

}
