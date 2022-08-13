package JerseyManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
	Scanner input=new Scanner(System.in);
	static ArrayList<LoginPojo> loginmap=new ArrayList<LoginPojo>();
	public void loginpage() {
		
		LoginPojo addDetails=new LoginPojo();
		System.out.println("Enter your UserName");
		addDetails.setUsername(input.next());
		System.out.println("Enter your Password");
		addDetails.setPassword(input.next());
		System.out.println("Enter the type of user");
		addDetails.setTypeOfUser(input.next());
		loginmap.add(addDetails);
		System.out.println(loginmap);
		
		
	}

}
