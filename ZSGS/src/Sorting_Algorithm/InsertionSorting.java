package Sorting_Algorithm;

import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) {
		new InsertionSorting().arrayinput();
		

	}

	private void arrayinput() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=input.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		insertionsort(array);
		printResultantArray(array);
	}

	private void insertionsort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]<key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
					
		}
		
		
		
	}

	
	private void printResultantArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	

}
