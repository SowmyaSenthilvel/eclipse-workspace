package ConsoleApplication;
import java.util.Scanner;

public class NewApplication {
	private void loginPage() {
		Scanner input=new Scanner(System.in);
		boolean isExit=true;
		
		while(isExit) {
			 System.out.println();
			 System.out.println("    Welcome to Login Page    ");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student Details ");
			 System.out.println("2 for Viewing Student Details ");
			 System.out.println("3 for Exit");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 new StudentCreation().studentcreation();
				 break;
			 case 2:
				 new StudentDetails().studentdetails();
				 break;
			 case 3:
				 System.out.println("    Thank You    ");
				 isExit=false;
				 break;
			 default :
				 System.out.println();
				 System.out.println("Enter a valid Choice");
				 break;
			 }
			 
		}
	}

	public static void main(String[] args) {
		new NewApplication().loginPage();
		
		

	}

	

}
