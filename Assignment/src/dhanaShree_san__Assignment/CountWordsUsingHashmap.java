package dhanaShree_san__Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsUsingHashmap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		System.out.println("Enter a string");
		String s=input.nextLine();
		String[] array=s.split("\\ ");
		for(String str:array) {
		map.put(str, map.getOrDefault(str, 0)+1);
		}
		for(Map.Entry entryobj:map.entrySet()) {
			System.out.println("key is  "+entryobj.getKey()+" and the respected value is  "+entryobj.getValue());
			
		}
	}

}
