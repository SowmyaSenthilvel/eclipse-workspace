import java.util.Scanner;
public class Maximum {	
		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=input.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		int max;
		max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum element in the array is" + max);
	}
		
	
}