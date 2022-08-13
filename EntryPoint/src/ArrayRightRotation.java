import java.util.Scanner;

public class ArrayRightRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the number of times the array to be rotated ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			int j, end;
			end = arr[0];
			for (j = 0; j < size - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = end;
		}
		System.out.println("After Rotation ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
