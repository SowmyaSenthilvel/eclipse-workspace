
public class StringPopulate {

	public static void main(String[] args) {
		String s="aaabbbcccdddeeeffffhhhh";
		int ch[]=new int[26];
		for(int i=0;i<s.length();i++) {
			
			ch[s.charAt(i)-'a']++;
			
		}
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println((char)s.charAt(i)+" - "+ch[s.charAt(i)-'a']);
			
		}

	}

}
