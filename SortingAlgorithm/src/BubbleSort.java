import java.util.*;
public class BubbleSort{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the total number of elements in array");
		n=input.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("bubble sort:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
