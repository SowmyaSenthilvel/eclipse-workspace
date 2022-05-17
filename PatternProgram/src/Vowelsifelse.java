import java.util.*;
public class Vowelsifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=input.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
			System.out.println(ch+" is a Vowel");
		}
		else {
			System.out.println(ch + " is a Consonant");
		}
	}

}
