import java.util.*;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=input.nextInt();
		System.out.println("Enter the number of coloumns");
		int col=input.nextInt();
		int transArray[][]=new int[row][col];
		int arr1[][]=new int[row][col];
		System.out.println("Enter the elements in array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=input.nextInt();
				transArray[j][i]=arr1[i][j];
			}
		}
		System.out.println("The transposed array of array1 ");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transArray[i][j]+" ");
			}
			System.out.println();
////			System.out.println();		
//		for(int i=arr.length-1;i>=0;i--) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[j][i] +" \t");
//			}
//			System.out.println();
//		}

		}

	}

}
