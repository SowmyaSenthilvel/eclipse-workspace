package date09_07_22;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count =1;
		System.out.println("Enter the size of row");
		int n = input.nextInt();
		String [][] arr = new String[n][n];
		int [][] lookup = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					arr[i][j] = ""+count;
					count++;
					lookup[i][j] =1;
				}
				else
				{
					arr[i][j] = " ";
				}
			}
		for(int k =n-1; k>n/2;k--)
		{
			for(int i=k-1;i>=0;i--)
			{
				if(lookup[i][k]!=1)
				{
				arr[i][k] = ""+count;
				count++;
				lookup[i][k] =1;
				}
			}
			for(int i=k-1;i>n-k-1;i--)
			{
				if(lookup[n-k-1][i]!=1)
				{
				arr[n-k-1][i] = ""+count;
				count++;
				lookup[n-k-1][i] =1;
				}
			}
			for(int i=n-k;i<k-1;i++)
			{
				if(lookup[i][i+1]!=1)
				{
				arr[i][i+1] = ""+count;
				count++;
				lookup[i][i+1] =1;
				}
			}
			
			
			
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++	) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
			
		}


	}

}
