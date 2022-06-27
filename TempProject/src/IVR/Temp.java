package IVR;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter array elements");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int ans=arr[0][0];
		for(int i=0;i<3;i++) {
			if(arr[i][i]==ans) {
				System.out.println("The diagonal elements are equal");
				break;
			}
			else {
				System.out.println("The diagonal element is not equal");
				break;
			}
				
		}
		
	}

}
