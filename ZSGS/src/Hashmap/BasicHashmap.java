package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class BasicHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "STR");
		map.put(2, "Orton");
		map.put(3, "Rio");
		System.out.println(map);
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(4, "Simon");
		map1.put(5, "Vijay");
		map1.put(6, "Mansen");
		map1.putAll(map);
		System.out.println(map1);
		for(Entry <Integer,String> obj:map1.entrySet()) {
			System.out.println(obj.getKey()+" "+obj.getValue());
		}

	}

}
