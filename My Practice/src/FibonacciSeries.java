import java.util.Scanner;

public class FibonacciSeries {
	public static void withoutRecursion() {
		Scanner input=new Scanner(System.in);
		int n1=0,n2=1,n3;
		System.out.println("Enter the number to fibonacci series");
		int count=input.nextInt();
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void withRecursion() {
		
	}

	public static void main(String[] args) {
		withoutRecursion();

	}

}
