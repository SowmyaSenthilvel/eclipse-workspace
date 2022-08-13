package PatternPrograms;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int r=input.nextInt();
		System.out.println("Enter thsize of column");
		int c=input.nextInt();
		int arr[][]=new int[r][c];
		int count=0;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==j) {
					arr[i][j]=count;
					count++;
				}
				
			}
		}
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
