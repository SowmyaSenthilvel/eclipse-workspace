package dhanaShree_san__Assignment;

import java.util.Scanner;

public class SwapNumbers {
	public static void withTempVaribale(int n1,int n2) {
		System.out.println("Using temporary Variable");
		System.out.println(" Before swapping Two numbers are "+n1+" and "+n2);
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swapping two numbers "+n1+" and"+n2);
		
	}
	public static void withoutTempVariable(int n1,int n2) {
		System.out.println("Without USing Temporary variable");
		System.out.println(" Before swapping Two numbers are "+n1+" and "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swapping two numbers "+n1+" and"+n2);
		
		
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int n1=input.nextInt();
		System.out.println("Enter another number");
		int n2=input.nextInt();
		withTempVaribale(n1, n2);
		withoutTempVariable(n1, n2);
		
		
		

	}

}
