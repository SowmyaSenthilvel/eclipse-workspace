package MailApplication;

import java.util.Scanner;
public class ApplicationStart {
	static CreateAccount createAct=new CreateAccount();
	static LoginPage loginAct=new LoginPage();

	public static void main(String[] args) {
		boolean end=true;
		while(end) {
			System.out.println();
			System.out.println("WELCOME TO JEE MAIL");
			System.out.println();
			System.out.println("Enter 1 for Creating account in JEE MAIL");
			System.out.println("Enter 2 for login into your account in JEE MAIL");
			System.out.println("Enter 3 to Exit");
			System.out.println();
			Scanner input=new Scanner(System.in);
			byte choice=0;
			String str=input.next();
			if(str.length()==1 && Character.isDigit(str.charAt(0)))
			choice=Byte.parseByte(str);
			switch(choice) {
			case 1:
				System.out.println("Create your JEE Account");
				createAct.createaccount();
				break;
			case 2:
				System.out.println("Login to Your Account");
				loginAct.loginYourAccount();
				break;
			case 3:
				System.out.println("Thankyou");
				end=false;
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
			
		}

	}

}
