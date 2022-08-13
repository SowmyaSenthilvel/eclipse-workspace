import java.util.Scanner;

public class SumOfAdjacentPairs {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<array.length;i=i+2) {
			sum=array[i]+array[i+1];
			System.out.print(sum+" ");
			
		}
		

	}

}
