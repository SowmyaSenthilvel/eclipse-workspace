package dhanaShree_san__Assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Three digit Armstrong Number
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int n=input.nextInt();
		int sum=0,rem;
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=(int) (sum+Math.pow(rem, 3));
			n=n/10;
		}
		n=temp;
		if(n==sum) {
			System.out.println("It is Armstrong number");
			
		}
		else {
			System.out.println("It is not armstrong number");
		}

	}

}
