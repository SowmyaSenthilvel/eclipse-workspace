package dhanaShree_san__Assignment;

import java.util.Scanner;

public class Palindrome {
	public static void palindromeString(String[] s) {
		int i=0;
		int j=s.length-1;
		while(i<j) {
			if(s[i]!=s[j]) {
				System.out.println("It is not a palindrome string");
			}
			else {
				System.out.println("It is palindrome string");
			}
			i++;
			j--;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] s=new String[5];
		System.out.println("Enter a string");
		for(int i=0;i<s.length;i++) {
			s[i]=input.next();
		}
		palindromeString(s);
		//int number=input.nextInt();

	}

}
