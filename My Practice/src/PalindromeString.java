import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String string=input.next();
		int i=0;
		int j=string.length()-1;
		int count=0;
		while(i!=j) {
			if(string.charAt(i)!=string.charAt(j)) {
				System.out.println("The given string "+string+" is not palindrome");
				break;
			}
			else {
				count++;
			}
			i++;
			j--;
			
		}
		//System.out.println(count);
	
		if(count==string.length()/2) {
			System.out.println("The given string "+string+" is  palindrome");
		}
	}

}
