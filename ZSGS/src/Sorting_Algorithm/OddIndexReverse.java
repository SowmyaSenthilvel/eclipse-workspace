package Sorting_Algorithm;

import java.util.Scanner;

public class OddIndexReverse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array Elements ");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int temp;
		int len=(n%2==0)?n-1:n-2;
		for (int i = 1; i < n/2; i += 2) {
            for (int j = len; j >=1; j -= 2) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
			
		}
	}
	

}
