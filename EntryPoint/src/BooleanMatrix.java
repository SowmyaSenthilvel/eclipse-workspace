import java.util.Arrays;
import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row of 2D array");
		int r=input.nextInt();
		System.out.println("Enter the column of 2D array");
		int c=input.nextInt();
		int mainarr[][]=new int[r][c];
		System.out.println("Enter the array elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mainarr[i][j]=input.nextInt();
			}
			
		}
		int row[]=new int[r];
		int col[]=new int[c];
		Arrays.fill(row, 0);
		Arrays.fill(col, 0);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(mainarr[i][j]==1) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(mainarr[i][j]==0 || row[i]==1 || col[j]==1) {
					mainarr[i][j]=1;
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(mainarr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
