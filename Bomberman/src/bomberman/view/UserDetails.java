package bomberman.view;

import bomberman.model.User;

public class UserDetails {

	public void viewUserDetails() {
		for(User individualUser:User.userDetails) {
			System.out.println(individualUser.getUsername());
			System.out.println(individualUser.getEmailId());
		}
		
	}
	

}
