package SearchingAlgorithm;

import java.util.Scanner;
import java.util.regex.*;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter a number to be searched in the array");
		int n=input.nextInt();
		int pos;
		for( pos=0;pos<size;pos++) {
			if(array[pos]==n) {
				System.out.println("The searched element is "+array[pos]+" found at position "+(pos+1));
				break;
			}	
			else if(pos==array.length) {
				System.out.println("Seached element is not present!!!");
				break;
			}
		}
		
	}

}
