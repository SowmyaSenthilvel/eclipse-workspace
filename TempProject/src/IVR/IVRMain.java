package IVR;

import java.util.Scanner;
import java.util.Stack;

public class IVRMain {
public static void main(String[] args) {
	Menus menu=new Menus();
	int choice=0,cchoice,popval;
	Scanner sc=new Scanner(System.in);
	Stack<Integer> flowStack=new Stack<>();
	
	System.out.println("Welcome to IVR CHATBOT");
	
	while(choice!=3)
	{
		if(choice==0)
		{
			menu.getMainMenu();
			choice=sc.nextInt();
			flowStack.push(choice);
		}
		switch (choice) {
		case 1:
			menu.getMobileRechargeMenu();
			cchoice=sc.nextInt();
			choice=choice*10+cchoice;
			flowStack.push(choice);
			while(choice>=11&&choice<=13)
			{
			switch(choice)
			{
			case 11:
				
				menu.getPrepaid();
				cchoice=sc.nextInt();
				choice=choice*10+cchoice;
				flowStack.push(choice);
				if(choice==115)
				{
					choice=menu.goBack(choice, flowStack);
				}
				else if(choice==116) {
					menu.goBackToMainMenu(flowStack);
					choice=0;
				}
				else
				{
					System.out.println("Enter the Mobile Number");
					sc.nextLong();
					System.out.println("Enter the amount");
					sc.nextInt();
					System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
					System.out.println("Redirecting to Main Menu");
					menu.goBackToMainMenu(flowStack);
					choice=0;
					}
			
				break;
			case 12:
				menu.getPostpaid();
				cchoice=sc.nextInt();
				choice=choice*10+cchoice;
				flowStack.push(choice);
				if(choice==125)
				{ 
					choice=menu.goBack(choice, flowStack);
				}
				else if(choice==126) {
					menu.goBackToMainMenu(flowStack);
					choice=0;
				
				}
				else
				{
					System.out.println("Enter the Mobile Number");
					sc.nextLong();
					System.out.println("Enter the amount");
					sc.nextInt();
					System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
					System.out.println("Redirecting to Main Menu");
					menu.goBackToMainMenu(flowStack);
					choice=0;
					}
			
				break;
			case 13:
				menu.goBackToMainMenu(flowStack);
				choice=0;
				
			}
			}
			break;
		case 2:		
			menu.getDTHMenus();
			cchoice=sc.nextInt();
			choice=choice*10+cchoice;
			flowStack.push(choice);
			if(choice==26)
			 {
				menu.goBackToMainMenu(flowStack);
				choice=0;
			}
			else
			{
				System.out.println("Enter the customer ID");
				sc.nextInt();
				System.out.println("Enter the Recharge Amount");
				sc.nextInt();
				System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
				System.out.println("Redirecting to Main Menu");
				menu.goBackToMainMenu(flowStack);
				choice=0;
				
			}
			
			break;
		case 3:
			flowStack.clear();
			System.out.println("ThankYou for Reaching us!!!");
			System.exit(0);
			break;
	}
		}
}
}
