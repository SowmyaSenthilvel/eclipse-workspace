package dhanaShree_san__Assignment;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number to check prime number ");
		int n=input.nextInt();
		int count=0;
		if(n<2) {
			System.out.println("The number "+n+" is not prime number");
		}
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("The number "+n+" is not a prime number");
		}
		else if(count>=2){
			System.out.println("The number "+n+"  is a prime number");

			
		}
		
	}

}
