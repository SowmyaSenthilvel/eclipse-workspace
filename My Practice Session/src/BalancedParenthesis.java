import java.util.Scanner;

public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=input.next();
		BalancedParenthesis bp=new BalancedParenthesis();
		boolean isBalanced=bp.checkParenthesis(str);
		if(isBalanced) {
			System.out.println("The given string is balanced parenthesis");
		}
		else {
			System.out.println("The given string is not a balanced parenthesis");
			
		}

	}

	private boolean checkParenthesis(String str) {
		char[] ch=new char[str.length()];
		int charIndex=0;
		for(int i=0;i<ch.length;i++) {
			char c=str.charAt(i);
			if(c=='(' || c=='[' || c=='{') {
				ch[charIndex]=c;
				charIndex++;
				continue;
			}
			if(ch[0]==0) {
				return false;
			}
			char check;
			switch(c) {
			case ')':
				check=ch[charIndex-1];
				if(check=='[' || check=='{') {
					return false;
					
				}
				break;
			case '}':
				check =ch[charIndex-1];
				if(check=='[' || check=='(') {
					return false;
				}
				break;
			
			case ']':
				check =ch[charIndex-1];
				if(check=='{' || check=='(') {
					return false;
				}
			
				break;
			}
			ch[charIndex-1]=0;
			charIndex--;
			
		}
		return ch[0]==0?true:false;
	}

}
