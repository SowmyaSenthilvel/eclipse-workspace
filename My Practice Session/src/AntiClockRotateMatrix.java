import java.util.Scanner;

public class AntiClockRotateMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a row ");
		int row=input.nextInt();
		System.out.println("Enter a column ");
		int column=input.nextInt();
		int arr[][]=new int[row][column];
		System.out.println("Enter the matrix element");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		rotate(arr,row,column);
	}

	private static void rotate(int[][] arr, int row, int column) {
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}

}
