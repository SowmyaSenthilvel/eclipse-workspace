import java.util.Scanner;

public class NewPatternX {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row M:");
		int M=input.nextInt();
		System.out.println("Enter the column N:");
		int N=input.nextInt();
		int arr[][]=new int[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(i==0||j==0 || i==M-1||j==N-1) {
					System.out.print("X ");
				}
				else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
		

	}

}
