import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a");
		int a=input.nextInt();
		int count=0;
		do {
		System.out.println("Enter b");
		int b=input.nextInt();
		if(a==b) {
			
			System.out.println("Correct");
			System.exit(0);
		}
		else {
			System.out.println("Entered number is invalid ");
			count++;
			
		}
		}while(count<=3);
		
	}

}
