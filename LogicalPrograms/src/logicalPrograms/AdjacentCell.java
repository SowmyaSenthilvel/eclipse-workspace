package logicalPrograms;

import java.util.Scanner;

public class AdjacentCell {

	public static void main(String[] args) {
		getInputMatrix();
	}

	private static void getInputMatrix() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a row size");
		int row = input.nextInt();
		System.out.println("Enter a column size");
		int col = input.nextInt();
		int matrix[][] = new int[row][col];
		int temporaryMatrix[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		changematrix(matrix, temporaryMatrix, row, col);

	}

	private static void changematrix(int[][] matrix, int[][] temporaryMatrix, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(matrix[i][j]==1) {
					temporaryMatrix[i][j]=1;
				}
			}
			
		}
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) {
				if(matrix[j][i]==1) {
					temporaryMatrix[j][i]=1;
				}
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(temporaryMatrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
