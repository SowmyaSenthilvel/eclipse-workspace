import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingString {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner input=new Scanner(System.in);
		String string=input.next();
		String pattern=input.next();
		new MatchingString().wildcardPattern(string,pattern);

	}
	private void wildcardPattern(String string,String pattern) {
		Pattern pt=Pattern.compile(pattern);
		Matcher match=pt.matcher(string);
		if(match.matches()) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}	
	}
}
