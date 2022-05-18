import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		double rem=0;
		int last=0;
		int power=0;
		while(n>0) {
			last=n%10;
			rem=rem+last*Math.pow(2,power);
			n=n/10;
			power++;
			
		}
		System.out.println(rem);

	}

}
