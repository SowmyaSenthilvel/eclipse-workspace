package PatternPrograms;

import java.util.Scanner;

public class PyramidProgram {
	public static void pyramid() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a size");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void numberPyramid() {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter a size");
			int n=input.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}
	public static void alphabetPyramid() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a size");
		char fst=input.next().charAt(0);
		char last=input.next().charAt(0);
		for(int i=1;i<=(last-'A'+1);++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(fst+" ");
			}
			fst++;
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
//		PyramidProgram.pyramid();
//		PyramidProgram.numberPyramid();
		PyramidProgram.alphabetPyramid();

	}
	

}
