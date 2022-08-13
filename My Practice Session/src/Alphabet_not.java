import java.util.Scanner;

public class Alphabet_not {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Character");
		char c=input.next().charAt(0);
		if((c >='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println(c+" is a alphabet");
		}
		else {
			System.out.println(c+" is not an alphabet");
		}

	}

}
