package Validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String ipStr1 = input.next();//"255.245.188.123"; // valid IP address
	    String ipStr2 = input.next();//"255.245.188.273"; // invalid IP address - 273 is greater than 255

	    validateIP(ipStr1);
	    validateIP(ipStr2);
	}

	public static void validateIP(String ipStr) {
	    String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
	    System.out.println(ipStr + " is valid? " + Pattern.matches(regex, ipStr));
		
	}

}
