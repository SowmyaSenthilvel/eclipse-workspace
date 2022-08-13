package TenkasiInterviewQues;

import java.util.Scanner;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=input.nextInt();
		System.out.println("Enter the elements");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
		    a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
