import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String ");
		String string=input.next();
		int[] charArray=new int[26];
		
		int max=1;
		for(int i=0;i<string.length();i++) {
			if(charArray[string.charAt(i)-'a']==0) {
				charArray[string.charAt(i)-'a']=i+1;
			}
			else {
				int length=calculateLength(charArray);
				max=Math.max(max, length);
				i=charArray[string.charAt(i)-'a']-1;
				charArray=new int[26];
			}
		}
		int charlength=calculateLength(charArray);
		max=Math.max(max, charlength);
		System.out.println(max);
		

	}

	private static int calculateLength(int charArray[]) {
		int length = 0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=0) {
				length++;
			}
			
		}
		return length;
	}

	
}
