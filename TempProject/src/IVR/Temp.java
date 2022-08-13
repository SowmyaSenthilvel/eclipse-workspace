package IVR;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length ");
		int n=input.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int ans=arr[0][0];
		int count=0;
		for(int i=1;i<n;i++) {
			if(arr[i][i]==ans) {
				
				count++;
			}	
		}
		if(count==n-1) {
			System.out.println("The diagonal elements are equal");
		}
		else {
			System.out.println("The diagonal element is not equal");
			
		}
		
	}

}
