package MailApplication;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CreateAccount {
	
	static LinkedHashMap<String, CreateAccount> dataAdding=new LinkedHashMap<String, CreateAccount>();
	
	String name;
	String mobile;
	String password;
	LinkedHashMap<Integer, Mails> inbox=new LinkedHashMap<Integer, Mails>();
	LinkedHashMap<Integer, Mails> sentbox=new LinkedHashMap<Integer, Mails>();
	
	Scanner input=new Scanner(System.in);
	public CreateAccount(String name,String mobile,String password,LinkedHashMap inbox,LinkedHashMap sentbox) {
		this.name=name;
		this.mobile=mobile;
		this.password=password;
		this.inbox=inbox;
		this.sentbox=sentbox;
	}
	public CreateAccount() {
		
	}
	public void createaccount() {
		System.out.println("     Welcome to JEE MAIL Sigup Page     ");
		int i=1;
		while(i<=4) {
			if(i==1) {
				System.out.println("Enter UserName:");
				name=input.nextLine();
				i++;
			}
			else if(i==2) {
				System.out.println("Enter Your Mobile Number:");
				mobile=input.nextLine();
				if(mobile.length()==10) {
					i++;
				}
				else {
					System.out.println("Please enter a 10 digit Mobile Number.");
					i=2;
				}
			}
			else if(i==3){
				System.out.println("Enter Password:");
				password=input.nextLine();
				i++;
			}
			else if(i==4) {
				CreateAccount personalAccount=new CreateAccount(name,mobile,password,inbox,sentbox);
				dataAdding.put(name, personalAccount);
				System.out.println("       ACCOUNT CREATED SUCCESSFULLY     ");
				System.out.println("      THANK YOU      ");
				i++;
				
			}
		}
	}
	
	
	

}
