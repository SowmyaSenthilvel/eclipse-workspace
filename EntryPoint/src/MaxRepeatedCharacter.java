import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeatedCharacter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=input.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int count;
		for(int i=0;i<s.length();i++) {
			Character  c=s.charAt(i);
			if(map.containsKey(c)){
				count=map.get(c);
				map.put(c, count+1);
			}
			else{
				map.put(c,1);
			}
		}
		System.out.println("All entries in map");
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		int max=0;
		char keys ='\0';
		System.out.println();
		for(Map.Entry<Character,Integer> obj:map.entrySet()) {
			if(obj.getValue()>max) {
				max=obj.getValue();
				keys=obj.getKey();
				
			}
			
		}
		System.out.println(keys+" "+max);
		
		
	}
}
