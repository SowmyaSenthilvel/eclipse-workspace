import java.util.*;

public class SwitchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=input.nextInt();
		switch((25<=n && n<=30) ? 0 :(31<=n && n<=35) ? 1 : 2) {
		case 0:
			System.out.println("The number is between 25 to 30");
			break;
		case 1:
			System.out.println("The number is between 31 to 35");
			break;
		case 2:
			System.out.println("The number is not b/w 25 to 35");
			break;
		
		}

	}

}
