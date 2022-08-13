import java.util.Scanner;

public class IndexOfExtraElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = input.nextInt();
		if (size == 0) {
			System.out.println("Enter a valid array size");
		} 
		else {
			int array1[] = new int[size];
			int array2[] = new int[size - 1];
			System.out.println("Enter the array1 Elements");
			for (int i = 0; i < array1.length; i++) {
				array1[i] = input.nextInt();
			}
			System.out.println("Enter the arrary2 Elements ");
			for (int i = 0; i < array2.length; i++) {
				array2[i] = input.nextInt();
			}
			int pointer1 = 0;
			for (int i = 0; i < array1.length; i++) {
				if (array1[pointer1] == array2[pointer1]) {
					pointer1++;

				} else {
					System.out.println(pointer1);
					break;
				}
			}
		}
	}

}
