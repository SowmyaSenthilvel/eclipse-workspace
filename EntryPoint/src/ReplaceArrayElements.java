import java.util.Scanner;

public class ReplaceArrayElements {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int ar[]=new int[n];
		
		for(int i=0;i<n-1;i++) {
			int fst=arr[i+1];
			for(int j=i+1;j<n;j++) {
			if(arr[j] >fst){
				fst=arr[j];
			}
			
		  }
		  ar[i]=fst;
		}
		ar[n-1]=-1;
		for(int i=0;i<n;i++) {
			System.out.print(ar[i] +" ");
		}
		

	}

}
