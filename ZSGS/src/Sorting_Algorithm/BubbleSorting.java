package Sorting_Algorithm;

import java.util.Scanner;

public class BubbleSorting {
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
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Bubble sorting ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
			
		}
		
	}

}
