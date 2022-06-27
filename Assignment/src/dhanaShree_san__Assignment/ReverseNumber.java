package dhanaShree_san__Assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number to reverse");
		int n=input.nextInt();
		int sum=0,rem;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println("The reverse of the number "+temp+" is "+sum);

	}

}
