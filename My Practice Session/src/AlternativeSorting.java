import java.util.Scanner;

public class AlternativeSorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize=input.nextInt();
		int arr[]=new int[arraySize];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arraySize;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arraySize;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(arr[j]<arr[i]) {
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				}
			}
		}
//		System.out.println("The sorted Array is");
//		for(int i=0;i<arraySize;i++) {
//			System.out.print (arr[i]+" ");
//		}
		System.out.println();
		int i=0,j=arraySize-1;
		while(i<j) {
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++]+" ");
		}
		if(arraySize%2!=0) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
