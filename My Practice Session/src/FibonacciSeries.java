import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a total number");
		int num=input.nextInt();
		int temp1=0,temp2=1,result;
		for(int i=2;i<num;i++) {
			result=temp1+temp2;
			System.out.println(result);
			temp1=temp2;
			temp2=result;
		}
		
	}

}
