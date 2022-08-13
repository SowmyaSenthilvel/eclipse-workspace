package PatternPrograms;

import java.util.Scanner;

public class MiddleNumberPattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}

//
//output-->
//
//Enter a size
//5
//    1
//   123
//  12345
// 1234567
//123456789
