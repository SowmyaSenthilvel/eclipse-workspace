package MatrixProblems;

import java.util.Scanner;

public class Rotateby90 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=input.nextInt();
		System.out.println("Enter the column size");
		int column=input.nextInt();
		int[][] matrix=new int[row][column];
		int[][] transpose=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=input.nextInt();
				transpose[j][i]=matrix[i][j];
			}
		}
		for(int i=0;i<row ;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(transpose[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
