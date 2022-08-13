package date22_07_2022;

import java.util.Scanner;

public class RemovePalindromeFromString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String string=input.next();
		
		System.out.println(removePalindrome(string));
	}

	private static String removePalindrome(String string) {
		String s="",word="";
		string=string+" ";
		for(int i=0;i<s.length();i++) {
			if(string.charAt(i)!=' ') {
				word=word+string.charAt(i);
				
			}
			else {
				if(!(isPalindrome(word))) 
					s+=word+" ";
				word=" ";
			}
		}
		return s;
	}

	private static boolean isPalindrome(String word) {
		int i=0,j=word.length()-1;
		while(i<j) {
			if(word.charAt(i++)!=word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
