package Sorting_Algorithm;

import java.util.Scanner;

public class SelectionSortUsingString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=input.nextInt();
		String str[]=new String[n];
		System.out.println("Enter the array Elements ");
		for(int i=0;i<n;i++) {
			str[i]=input.next();
		}
		String temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i].compareTo (str[j])>0) {
					temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
				
			}
		}
		System.out.println("After selection sort s");
		for(int i=0;i<n;i++) {
			System.out.print(str[i]+" ");
		}
		

	}

}
