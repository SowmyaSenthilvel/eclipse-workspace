
import java.util.Scanner;

public class ArmStrong_inter {
	public static void main(String[] args) {
		int start_value, end_value;
		Scanner scanner = new Scanner(System.in);
		start_value = scanner.nextInt();
		end_value = scanner.nextInt();
		for (int number = start_value + 1; number < end_value; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;

			// number of digits calculation
			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}

			originalNumber = number;

			// result contains sum of nth power of its digits
			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}

			if (result == number) {
				System.out.print(number + " ");
			}
		}
		scanner.close();
	}
}