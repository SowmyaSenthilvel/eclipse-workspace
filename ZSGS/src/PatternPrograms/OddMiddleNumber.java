package PatternPrograms;

import java.util.Scanner;

public class OddMiddleNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a size");
		int num = input.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int k = 2 * i - 1; k >= 1; k--) {
				System.out.print(n + " ");
			}
			n += 2;
			System.out.println();
		}
	}

}
