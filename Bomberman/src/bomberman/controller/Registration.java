package bomberman.controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import bomberman.model.User;
import bomberman.view.UserDetails;

public class Registration implements Form {

	public void signUp() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your UserName");
		String userName = input.nextLine();
		System.out.println("Enter your EmaiID");
		String emailID = input.nextLine();
		while(!emailValidationCheck(emailID))
			emailID = input.nextLine();
		System.out.println("Enter your Password");
		String password = input.nextLine();
		while(!passwordValidationCheck(password))
			password = input.nextLine();
		System.out.println("Confirm your Password");
		String confirmPassword = input.nextLine();
		if (password.equals(confirmPassword)) {
			User user = new User();
			user.setUsername(userName);
			user.setPassword(confirmPassword);
			user.setEmailId(emailID);
			User.userDetails.add(user);
			new UserDetails().viewUserDetails();
		} else {
			System.out.println("Password doesn't match");
			signUp();
		}

	}

	@Override
	public void signIn() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Email Id");
		String currentUserEmailId = input.nextLine();
		System.out.println("Enter your password");
		String currentUserPassword = input.nextLine();
		boolean emailChecker = false;
		for (User individualUser : User.userDetails) {
			if (currentUserEmailId.equals(individualUser.getEmailId())) {
				emailChecker = true;
				break;

			}
		}
		if (emailChecker) {
			boolean passwordCheck = false;
			for (User individualUser : User.userDetails) {
				if (currentUserPassword.equals(individualUser.getPassword())) {
					passwordCheck = true;
					break;

				}
			}
			if (passwordCheck) {
				System.out.println("Successfully Logged In");

			} else {
				System.out.println("Incorrect password");
				signIn();
			}

		} else {
			System.out.println("Not yet Registered");
			signUp();
		}

	}

	private boolean passwordValidationCheck(String password) {
		String passwordRegex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
		boolean passwordResult =Pattern.matches(passwordRegex, password);
		if(passwordResult== false) {
			System.out.println("Password is not Strong");
			System.out.println("Please Enter a Valid Password");
			return false;
		}
		return true;
	}

	private boolean emailValidationCheck(String emailID) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[a-z]+(.+)$";
		boolean emailResult = Pattern.matches(emailRegex, emailID);
		if (emailResult == false) {
			System.out.println("Invalid Email Address!");
			System.out.println("Enter a valid Email Id");
			return false;
		}
		return true;
	}
	

}
