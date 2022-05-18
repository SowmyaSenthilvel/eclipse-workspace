import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int array[]=new int[10];
		int i=0;
		while(n>0) {
			array[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1; j>=0;j--) {
			System.out.print(array[j]);
		}
			

	}

}
