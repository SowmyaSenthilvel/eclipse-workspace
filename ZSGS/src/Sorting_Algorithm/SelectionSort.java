package Sorting_Algorithm;

import java.util.Scanner;

public class SelectionSort {

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
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		System.out.println("After selection sort s");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
