import java.util.Scanner;
public class BitwiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a");
		a=input.nextInt();
		System.out.println("Enter b");
		b=input.nextInt();
		c=a|b;
		d=a&b;
		e=a^b;
		f=~a;
		System.out.println("Logical AND is"+ d);
		System.out.println("Logical OR is"+ c);
		System.out.println("Logical XOR is"+ e);
		System.out.println("Complement is"+ f);
		input.close();

	}

}
