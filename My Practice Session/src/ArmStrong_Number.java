import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		int originalnumber, remainder, result = 0;
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		originalnumber = scanner.nextInt();
		number = originalnumber;
		while (originalnumber != 0) {
			remainder = originalnumber % 10;
			result += Math.pow(remainder, 3);
			originalnumber /= 10;
		}
		scanner.close();
		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

	}

}
gelosil edithi thaa nenju kariku