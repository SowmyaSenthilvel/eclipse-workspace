package dhanaShree_san__Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a length");
		int n=input.nextInt();
		System.out.println("Enter the hashset elements");
		for(int i=0;i<n;i++) {
			hs.add(input.next());
		}
		System.out.println("The hash set elements are" +hs);
		String[] str=new String[n];
		hs.toArray(str);
		System.out.println("The string array is");
		for(String s:str) {
			System.out.println(s);
		}
		
	}

}
