package Matrix;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a row");
		int row=input.nextInt();
		System.out.println("Enter a coloumn");
		int col=input.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		int top=0;
		int bottom=row-1;
		int left=0;
		int right=col=1;
		

	}

}
