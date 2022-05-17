import java.util.Scanner;
class Rev{
    static  int reverse(int n){
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
	return sum;
    }
}
public class Sum
{
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		n=input.nextInt();
		int r=Rev.reverse(n);
		int diff=n-r;
		System.out.println("Difference is" + diff);
		
	}
}
