package flightTicketBooking.view;


import flightTicketBooking.model.LoginPojo;

public class ViewUser {
	public void viewUserDetails() {
		for(LoginPojo individualUser:LoginPojo.userDetails) {
			System.out.println();
			System.out.println("Welcome "+individualUser.getUsername());
			System.out.println("You have Logged in as "+individualUser.getEmailId());
			System.out.println();
			
		}
	}
}
