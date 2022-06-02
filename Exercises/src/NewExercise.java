import java.util.Scanner;

public class NewExercise {
	static void pattern1() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows=input.nextInt();
		System.out.println("Enter the number of columns ");
		int columns=input.nextInt();
		int arr[][]=new int[rows][columns];
		int count=rows*columns;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
		
	}
	static void pattern2() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows=input.nextInt();
		System.out.println("Enter the number of columns ");
		int columns=input.nextInt();
		int arr[][]=new int[rows][columns];
		
	}

	public static void main(String[] args) {
		pattern1();
	
	}

}
