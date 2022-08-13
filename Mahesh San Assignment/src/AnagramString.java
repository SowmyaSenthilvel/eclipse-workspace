import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String 1");
		String string1 = input.next();
		System.out.println("Enter a String 2");
		String string2 = input.next();
		char[] ch = string1.toCharArray();
		char[] ch1 = string2.toCharArray();
		if (string1.length() == string2.length()) {
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean check = Arrays.equals(ch, ch1);
			if (check) {
				System.out.println("The given string is anagram");
			} else {
				System.out.println("The given string is not anagram");

			}

		}

	}

}
