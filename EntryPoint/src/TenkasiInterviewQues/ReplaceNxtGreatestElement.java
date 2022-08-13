package TenkasiInterviewQues;

import java.util.Scanner;

public class ReplaceNxtGreatestElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int[] a=new int[n];
		for(int i=0;i<n-1;i++) {
			int fst=a[i+1];
			for(int j=i+1;j<n;j++) {
				if(arr[j]>fst) {
					fst=arr[j];
				}
				
			}
			arr[i]=fst;
		}
		arr[n-1]=-1;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
