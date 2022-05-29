package ProgramsOnStack;

import java.util.Scanner;

public class StackBasicOperations {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StackData stack=new StackData();
		boolean End=true;
		while(End) {
			System.out.println();
			System.out.println("1 For Pushing elements in Stack");
			System.out.println("2 For Popping elements from Stack");
			System.out.println("3 for Peek Operation in stack");
			System.out.println("4 For Exit the Program");
			System.out.println();
			byte choice=input.nextByte();
			switch(choice) {
			case 1:
				System.out.println("Pushing elements into the Stack");
				stack.pushdata();
				break;
			}
		}
	}

}
