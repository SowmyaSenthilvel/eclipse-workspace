package PatternPrograms;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=(n-1);j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print(k);
			}
			for(int l=1;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
//
//Ouput-->
//
//Enter a size
//5
//     0
//    101
//   21012
//  3210123
// 432101234
//
