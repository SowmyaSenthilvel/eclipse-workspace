package PatternPrograms;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character in capital letter");
		char c=input.next().charAt(0);
		int var=1;
		for(char i='A';i<=c;i++) {
			for(int j=c;j>i;j--) {
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


//output-->
//
//Enter a character in capital letter
//F
//          A 
//        B B B 
//      C C C C C 
//    D D D D D D D 
//  E E E E E E E E E 
//F F F F F F F F F F F 
