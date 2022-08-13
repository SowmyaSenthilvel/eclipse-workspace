package dhanaShree_san__Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsUsingHashmap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		System.out.println("Enter a string");
		String str=input.nextLine();
		String s=str.toLowerCase();
		String[] array=s.split("\\ ");
		for(String s1:array) {
		map.put(s1, map.getOrDefault(s1, 0)+1);
		}
		for(Map.Entry entryobj:map.entrySet()) {
			System.out.println("key is  "+entryobj.getKey()+" and the respected value is  "+entryobj.getValue());
			
		}
	}

}
