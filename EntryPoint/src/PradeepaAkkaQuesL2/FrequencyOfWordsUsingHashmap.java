package PradeepaAkkaQuesL2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfWordsUsingHashmap {
	
	//To count the frequency of character in the string
	public static void characterCountInString() {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		String s="aaabbbccc";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				int count=map.get(c[i]);
				map.put(c[i], count+1);
			}
			else {
				map.put(c[i],1);
			}
		}
		for(Entry<Character,Integer> entryobj:map.entrySet()) {
			System.out.println(entryobj.getKey()+"  "+entryobj.getValue());
			
		}
	}
	
	
	
	//To count the frequency of words in a sentence
	public static void wordsCountInString() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=input.nextLine();
		String[] s=str.split(" ");
		int count=0;
		int max=0;
		for(int i=0;i<s.length;i++) {
			
		}
		System.out.println(max);
		
			
	}
	public static void main(String[] args) {
	//	FrequencyOfWordsUsingHashmap.characterCountInString();
		//FrequencyOfWordsUsingHashmap.wordsCountInString();
		
	//	FrequencyOfWordsUsingHashmap.secondRepeatedCharacter();
	}

}
