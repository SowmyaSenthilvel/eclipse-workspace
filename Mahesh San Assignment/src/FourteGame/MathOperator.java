package FourteGame;

import java.util.Scanner;

public class MathOperator {
	Scanner input=new Scanner(System.in);

	public void mathoperator(char number) {
		System.out.println("Enter a operator--> + - * /");
		System.out.println("Enter the operator decision choice: ");
        int operator = input.nextInt();

        if (operator == 1) {
            operationReverse();
        } else {
            System.out.print("Enter the operator: ");
            number += input.next().charAt(0);
        }
    } 
	private void operationReverse(int number) {
		
		String changeValue = "";

        System.out.print("Enter the value to remove: ");
        char remove = input.next().charAt(0);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != remove) {
                changeValue += number.charAt(i);
            }
        }
        String defaultNumber = changeValue;
        String number
        
        count--;
		
	}
	

}
