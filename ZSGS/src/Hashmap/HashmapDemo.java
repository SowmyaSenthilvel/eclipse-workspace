package Hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap();
		map.put(10, "Rio");
		map.put(12, "Raj");
		map.put(13, "Charles");
		System.out.println("Hashmap is"+map);
		//Prints only keys
		Set s=map.keySet();
		System.out.println("Keys are"+s);
		//Prints only Values
		Collection<String> cl=map.values();
		System.out.println("Values are"+cl);
		//Prints the entries
		Set entryset=map.entrySet();
		System.out.println("Entry are"+entryset);
		

	}

}
