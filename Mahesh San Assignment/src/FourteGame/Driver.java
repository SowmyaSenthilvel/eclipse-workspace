package FourteGame;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("\tWelcome To Brainly Math ");
		calculatorUI();	
	}

	private static void calculatorUI() {
		int result=0;
		Scanner input=new Scanner(System.in);
		
		
		boolean AppEnd=true;
		while(AppEnd) {
			System.out.println("\t 1  Giving the four values ");
			System.out.println("\t 2  Giving the four operators");
			System.out.println("\t 3 Exit");
			int choice=input.nextByte();
			switch(choice) {
			case 1:
				new MathValue().mathvalue(choice,result);
				break;
			case 2:
				int number=input.nextInt();
				new MathOperator().mathoperator(0);
				break;
			case 3:
				AppEnd=false;
				break;
				
			}
		}
		
		
	}

}
