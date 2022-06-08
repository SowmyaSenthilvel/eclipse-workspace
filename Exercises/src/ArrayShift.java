import java.util.Scanner;

public class ArrayShift {
	public static void backshift() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter number to remove");
		int remove=input.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==remove) {
				for(int j=i;j>0;j--) {
					arr[j]=arr[j-1];
				}
			}
			arr[0]=1;
		}
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void frontshift() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the element to remove");
		int remove=input.nextInt();
		
		for(int i=size-1;i>=0;i--) {
			if(arr[i]==remove) {
				for(int j=i;j<size-1;j++) {
					arr[j]=arr[j+1];
				}
			}
			arr[size-1]=1;
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
//		System.out.println("Array Backshifting ");
//		backshift();
		System.out.println("Array Front shifting ");
		frontshift();
		

	}

}
