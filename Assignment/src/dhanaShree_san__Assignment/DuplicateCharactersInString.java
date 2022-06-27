package dhanaShree_san__Assignment;

import java.util.Scanner;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string");
		s=input.nextLine();
		char[] c=s.toCharArray();
		System.out.println("The string is "+s);
		System.out.println("Duplicate characters in string is");
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j] ){
					System.out.print(c[j]+" ");
					break;
					
				}
					
					
			}
			
		}
		

	}

}
