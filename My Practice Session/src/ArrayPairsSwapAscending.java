import java.util.Scanner;

public class ArrayPairsSwapAscending {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
			
		}
		int temp=0;
		for(int i=0;i<size-1;i=i+2) {
			if(i+1<array.length) {
				if(array[i]>array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		System.out.println("The resultant array is ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
