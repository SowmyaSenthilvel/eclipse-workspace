import java.util.Scanner;

public class OddNumbersRange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a start range ");
		int startNo=input.nextInt();
		System.out.println("Enter a end range ");
		int endNo=input.nextInt();
		for(int i=startNo;i<endNo;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
