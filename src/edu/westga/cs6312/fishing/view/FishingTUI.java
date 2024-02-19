package edu.westga.cs6312.fishing.view;

import edu.westga.cs6312.fishing.model.GameBoard;
import java.util.Scanner;

/**
 * Textual User Interface for the Fishing Game.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class FishingTUI {
	private GameBoard currentGameBoard;
	private Scanner userInput;

	/**
	 * Constructor for FishingTUI.
	 * 
	 * @param interactionGameBoard the game board to interact with
	 */
	public FishingTUI(GameBoard interactionGameBoard) {
		this.currentGameBoard = interactionGameBoard;
		this.userInput = new Scanner(System.in);
	}

	/**
	 * Runs the application, serving as the 'director' of the user interface.
	 */
	public void run() {
		int choice;
		do {
			this.displayMenu();
			choice = this.getIntegerFromUser("Choose an option: ");
			switch (choice) {
			case 1:
				this.describeCurrentFishingHole();
				break;
			case 2:
				this.describeAngler();
				break;
			case 3:
				this.describeGameBoard();
				break;
			case 4:
				this.move();
				break;
			case 5:
				this.fishFishingHole();
				break;
			case 9:
				System.out.println("Thank you for playing!");
				break;
			default:
				System.out.println("Invalid option, please try again.");
			}
		} while (choice != 9);
	}

	/**
	 * Displays the main menu to the user.
	 */
	private void displayMenu() {
		System.out.println("\nMenu:");
		System.out.println("1 - Describe current fishing hole");
		System.out.println("2 - Describe angler");
		System.out.println("3 - Describe game board");
		System.out.println("4 - Move");
		System.out.println("5 - Fish the fishing hole");
		System.out.println("9 - Quit the application");
	}

	/**
	 * Gets an integer value from the user.
	 * 
	 * @param message the message to display
	 * @return the integer entered by the user
	 */
	private int getIntegerFromUser(String message) {
		System.out.print(message);
		String inputLine = this.userInput.nextLine();
		int number = Integer.parseInt(inputLine);
		return number;
	}

	/**
	 * Describes the current fishing hole.
	 */
	private void describeCurrentFishingHole() {
		System.out.println(this.currentGameBoard.getCurrentFishingHole().toString());
	}

	/**
	 * Describes the angler.
	 */
	private void describeAngler() {
		System.out.println(this.currentGameBoard.getAngler().toString());
	}

	/**
	 * Describes the game board.
	 */
	private void describeGameBoard() {
		System.out.println(this.currentGameBoard.toString());
	}

	/**
	 * Handles the logic for moving the angler in the game. The user is prompted to
	 * choose a direction to move (either up or down) within the game board.
	 * Depending on the user's choice, the angler is moved accordingly, and the new
	 * current fishing hole's description is displayed. If the user selects an
	 * invalid option, an error message is shown, and no movement occurs.
	 */
	private void move() {
		System.out.println("Choose a direction to move:");
		System.out.println("1 - Up");
		System.out.println("2 - Down");
		int choice = this.getIntegerFromUser("Your choice: ");
		switch (choice) {
		case 1:
			this.currentGameBoard.moveUp();
			break;
		case 2:
			this.currentGameBoard.moveDown();
			break;
		default:
			System.out.println("Invalid direction, please try again.");
			return;
		}
		System.out.println("Moved to new fishing hole:");
		this.describeCurrentFishingHole();
	}
}