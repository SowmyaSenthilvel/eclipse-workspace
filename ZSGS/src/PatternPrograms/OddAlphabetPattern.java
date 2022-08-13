package PatternPrograms;

import java.util.Scanner;

public class OddAlphabetPattern {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character in capital letter");
		char c=input.next().charAt(0);
		int var=1;
		for(char i='A';i<=c;i=(char)(i+2)) {
			for(int j=c;j>i;j=j-2) {
				System.out.print("  ");
			}
			for(int k=1;k<=(2*var-1);k++) {
				System.out.print(i+" ");
			}
			var++;
			System.out.println();
		}
	}

}
//
//
//Output-->
//
//Enter a character in capital letter
//M
//            A 
//          C C C 
//        E E E E E 
//      G G G G G G G 
//    I I I I I I I I I 
//  K K K K K K K K K K K 
//M M M M M M M M M M M M M 
