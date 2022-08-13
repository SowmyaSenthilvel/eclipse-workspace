import java.util.Scanner;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=input.nextInt();
		int[] nums=new int[n];
		int[] ans=new int[2*n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			nums[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}

}
