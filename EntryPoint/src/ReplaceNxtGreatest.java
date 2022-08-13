import java.util.Scanner;

public class ReplaceNxtGreatest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int max=arr[n-1];
		arr[n-1]=-1;
		for(int i=n-2;i>=0;i--) {
			int temp=arr[i];
			arr[i]=max;
			max=temp;
			if(max<temp) {
				max=temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
