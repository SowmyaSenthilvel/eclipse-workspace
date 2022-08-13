
import java.util.Scanner;

public class KalaiAnagaram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		boolean result = checkAnagram(s1, s2);
		if (result == true) {
			System.out.println("anagram");
		} else {
			System.out.println("not a anagram");
		}

	}

	private static boolean checkAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean check = true;

		if (s1.length() != s2.length()) {
			return false;
		} else {
			int i = 0;
			String str1 = tolowerCase(s1);
			String str2 = tolowerCase(s2);
			for (int k = 0; k < str1.length(); k++) {

				for (int l = 0; l < str2.length(); l++) {

					if (str1.charAt(k) == str2.charAt(l)) {
						check = true;
						break;
					} else {
						check = false;
					}

				}
				if (check == false) {
					return false;

				}
			}

		}
		return true;
	}

	private static String tolowerCase(String s1) {
		int i = 0;
		String str1 = "";
		while (i <= s1.length() - 1) {
			if (s1.charAt(i) > 64 && s1.charAt(i) < 91)
				str1 = str1 + (char) (s1.charAt(i) + 32);
			else {
				str1 = str1 + s1.charAt(i);
			}
			i++;
		}
		System.out.println(str1);
		return str1;
	}

}