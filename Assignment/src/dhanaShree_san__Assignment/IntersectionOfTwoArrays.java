package dhanaShree_san__Assignment;

import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array1");
		int n1=input.nextInt();
		int[] array1=new int[n1];
		System.out.println("Enter the first array elements");
		for(int i=0;i<n1;i++) {
			array1[i]=input.nextInt();
			
		}
		System.out.println("Enter the length of array2");
		int n2=input.nextInt();
		int[] array2=new int[n2];
		System.out.println("Enter the second array elements");
		for(int i=0;i<n2;i++) {
			array2[i]=input.nextInt();
			
		}
		int intersectArray[]=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(array1[i]==array2[j]) {
					intersectArray[count]=array1[i];
					count++;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("Intersection of two Arrays are ");
		for(int i=0;i<count;i++) {
			System.out.print(" "+intersectArray[i]+" ");
		}
		System.out.println();

	}

}
