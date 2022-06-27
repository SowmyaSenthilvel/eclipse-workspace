package dhanaShree_san__Assignment;

import java.util.Scanner;

public class ReplacingfSpaceInString {
	public static void usingBuiltinMethod(String str){
		System.out.println("Replacing all spaces in the sentence");
		String st=str.replaceAll("\\s", "");
		System.out.println(st);
	}
	public static void withoutusingReplaceMethod(String str){
		char[] c=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
		
	}

	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string");
		s=input.nextLine();
		//usingBuiltinMethod(s);
		withoutusingReplaceMethod(s);

	}

}
