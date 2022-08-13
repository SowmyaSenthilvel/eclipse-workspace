package Validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter phone number");
		String ph=input.next();
		String PhoneRegex="(0/91)?[7-9][0-9]{9}";
		Pattern pattern=Pattern.compile(PhoneRegex);
		Matcher match=pattern.matcher(ph);
		boolean answer=match.matches();
		if(answer){
			System.out.println("The given Mobile number is valid");
		}
		else {
			System.out.println("The given phone number is not valid");
		}
	}
	

}
