package dhanaShree_san__Assignment;

import java.util.Scanner;

public class ReverseWithoutMethod {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string");
		s=input.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=s.length();i>0;i--) {
			sb.append(s.charAt(i-1));
			
		}
		System.out.println(sb);
	}

}
