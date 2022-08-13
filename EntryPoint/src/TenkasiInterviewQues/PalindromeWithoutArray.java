package TenkasiInterviewQues;

import java.util.Scanner;

public class PalindromeWithoutArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=input.nextInt();
		int temp=n;
		int rem,sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		
		//System.out.println(sum);
		if(sum==n) {
			System.out.println(temp+" is a Palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}

	}

}
