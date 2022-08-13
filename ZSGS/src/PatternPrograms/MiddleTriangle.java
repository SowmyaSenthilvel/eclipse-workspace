package PatternPrograms;

import java.util.Scanner;

public class MiddleTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=input.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
//
//Output-->
//
//Enter a number
//5
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
