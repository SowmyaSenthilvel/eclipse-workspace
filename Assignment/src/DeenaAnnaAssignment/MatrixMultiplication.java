package DeenaAnnaAssignment;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row of array 1");
		int row1 = input.nextInt();
		System.out.println("Enter the column of array 1");
		int col1 = input.nextInt();
		System.out.println("Enter the row of array 2");
		int row2 = input.nextInt();
		System.out.println("Enter the column of array 2");
		int col2 = input.nextInt();
		int array1[][] = new int[row1][col1];
		int array2[][] = new int[row2][col2];
		System.out.println("Enter the Array1 Elements");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				array1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the Array2 Elements");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				array2[i][j] = input.nextInt();
			}
		}
		int resultantArray[][] = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				resultantArray[i][j]=0;
				for(int k=0;k<col1;k++) {
					resultantArray[i][j] += array1[i][k] * array2[k][j];
				}
				System.out.print(resultantArray[i][j] + "   ");
			}
			System.out.println();
		}
		

	}

}
