package TenkasiInterviewQues;

import java.util.Scanner;

public class TwistedPrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		int count = 0;
		int rem, sum = 0,temp=0;
		int copy=n;
		while (n != 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;

		}
		
		temp=sum;
		for (int i = 1; i <= copy; i++) {
			if (copy % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			
			int count1 = 0;
			for (int i = 1; i <= temp; i++) {
				if (temp % i == 0) {
					count1++;
				}
			}
			if (count1 == 2) {
				System.out.println("The reverse of the number " + copy + "is also a prime number");
			}
			else {
				System.out.println("not a prime reverse");
			}
		} 
		else 
		{
			System.out.println("The given number is not a prime Number");
		}

	}

}
