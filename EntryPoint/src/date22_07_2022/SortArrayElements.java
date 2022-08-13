package date22_07_2022;

import java.util.Scanner;

public class SortArrayElements {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Array size");
		int arraySize=input.nextInt();
		int[] array=new int[arraySize];
		System.out.println("Array Elements are");
		for(int i=0;i<arraySize;i++) {
			array[i]=input.nextInt();
		}
		int frequency[]=new int[array.length];
		int visited=1;
		
		for(int i=0;i<arraySize;i++) {
			int count=1;
			for(int j=0;j<arraySize;j++) {
				if(array[i]==array[j] ){
					count++;
					frequency[j]=visited;
				}
			}
			if(frequency[i]!=visited) {
				frequency[i]=count;
			}
		}
		for(int i=0;i<frequency.length;i++) {
			if(array[i]!=visited) {
				System.out.println(array[i]+" "+frequency[i]);
			}
		}
		

	}

}
