import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int rem = 0;
		while(n>0) {
			rem=n%2;	
		}
		System.out.println(rem);
			

	}

}