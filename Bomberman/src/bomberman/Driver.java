package bomberman;

import java.util.Scanner;

import bomberman.controller.GamePlay;
import bomberman.controller.Registration;

public class Driver {

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Damal Dumil Bomb");
		System.out.println("--------------------------------------");
		new Driver().manageEngine();

	}

	private void manageEngine() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("1.New User");
			System.out.println("2.Existing User");
			System.out.println("3.Game Play");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			byte choiceOfManageEngine = input.nextByte();
			switch (choiceOfManageEngine) {
			case 1:
				new Registration().signUp();
				break;
			case 2:
				new Registration().signIn();
				break;
			case 3:
				new GamePlay().startGame();
				break;
			case 4:
				System.exit(0);
				break;

			}

		}

	}

}
