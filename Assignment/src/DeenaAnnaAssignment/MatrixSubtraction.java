package DeenaAnnaAssignment;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = input.nextInt();
		System.out.println("Enter the column");
		int col = input.nextInt();
		int array1[][] = new int[row][col];
		int array2[][] = new int[row][col];
		System.out.println("Enter the Array1 Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the Array2 Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array2[i][j] = input.nextInt();
			}
		}
		int resultantArray[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				resultantArray[i][j] = array1[i][j] - array2[i][j];
			}
		}
		System.out.println("Resultant Array OF Subtraction is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(resultantArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
