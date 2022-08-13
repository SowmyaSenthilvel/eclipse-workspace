import java.util.Scanner;

public class ReplaceRepeated {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=input.next();
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			 ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if((ch[i]==ch[j] || ch[i]+32==ch[j] || ch[i]-32==ch[j] )&& ch[i]=='Z') {
					ch[j]='A';
					i=-1;
					break;
				}
				if((ch[i]==ch[j] || ch[i]+32==ch[j] || ch[i]-32==ch[j] ) && ch[i]=='z') {
					ch[j]='a';
					i=-1;
					break;
				}
				if((ch[i]==ch[j] || ch[i]+32==ch[j] || ch[i]-32==ch[j] ) && ch[i]=='9') {
					ch[j]='0';
					i=-1;
					break;
				}
				
				if(ch[i]+32 ==ch[j] || ch[i]-32==ch[j]||ch[i]==ch[j]) {
					ch[j]=(char) (ch[i]+1);
				}
			}
			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}
