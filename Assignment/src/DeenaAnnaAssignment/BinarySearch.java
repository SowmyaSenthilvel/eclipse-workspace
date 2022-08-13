package DeenaAnnaAssignment;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array is");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the number to be searched in the array");
		int search=input.nextInt();
		
		int start=0;
		int end=arr.length-1;
		int mid=(end-start)/2;
		while(start<=end) {
			
			if(arr[mid]<search) {
				start=mid;
				mid=((end-start)/2) + 1;
				System.out.println(mid+1);
				break;
			}
			else if(arr[mid]>search) {
				
				end=mid;
				mid=(end-start)/2;
				System.out.println(mid);
				break;
			}
			else if(arr[mid]==search) {
				System.out.println(mid);
				break;
			}
			
		}
		

	}

}
