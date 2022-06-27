package dhanaShree_san__Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {
	public static void usingSorting(int[] array,int n) {
		Arrays.sort(array);
		System.out.println("The second Largest element in the array is "+array[n-2]);
		
	}
	
	public static void findsecondLargest(int[] array,int n) {
		int high=Integer.MIN_VALUE;
		int low=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(array[i]>high) {
				low=high;
				high=array[i];
			}
			else if(array[i]!=high && array[i]>low) {
				low=array[i];
			}
		}
		System.out.println("The second largest element in the array is "+low);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=input.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
			
		}
		usingSorting(array, n);
		findsecondLargest(array, n);
		
		


	}

}
