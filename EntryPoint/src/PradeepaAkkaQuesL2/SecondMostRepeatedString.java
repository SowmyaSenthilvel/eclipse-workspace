package PradeepaAkkaQuesL2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class SecondMostRepeatedString {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		System.out.println("Second most repeated character");
		char[] c= {'a','b','c','a','b','a','a','c','c'};
		int max=1;
		int premax=0;
		char ch='\0';
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				int count=map.get(c[i]);
				count = count+1;
				map.put(c[i], count);
				if(count>max) {
					ch=c[i];
					premax=max;
					max=count;
					//System.out.println(premax);
				}
				
				
			}
			else {
				map.put(c[i],1);
			}
			
		}
		System.out.println(ch);
		
		
//		
//		for(Entry<Character,Integer> entryobj:map.entrySet()) {
//			System.out.println(entryobj.getKey()+"  "+entryobj.getValue());
//			
//		}
	}
}
