package Hashmap;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap();
		map.put(10, "Randy");
		map.put(12, "John");
		map.put(13, "Cena");
		//Getting each values of keys
		System.out.println(map.get(1));	
		System.out.println();
		
		Set s=map.keySet();
		System.out.println(s);
		System.out.println();
		
		Collection<String> val=map.values();
		System.out.println(val);
		System.out.println();
		
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("Randy"));
		System.out.println(map.entrySet());
		
		System.out.println();
		//To Iterate hashmap 
		for(Entry<Integer, String> entryObj:map.entrySet()) {
			System.out.println(entryObj.getKey());
			System.out.println(entryObj.getValue());
		}
		
		
	}

}
