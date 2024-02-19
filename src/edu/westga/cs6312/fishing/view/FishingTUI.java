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
	 * @param gameBoard the game board to interact with
	 */
	public FishingTUI(GameBoard gameBoard) {
		this.currentGameBoard = gameBoard;
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
		System.out.println("Current Fishing Hole: " + this.currentGameBoard.getCurrentFishingHole().toString());
	}

	/**
	 * Describes the angler.
	 */
	private void describeAngler() {
		System.out.println("Angler: " + this.currentGameBoard.getAngler().toString());
	}

	/**
	 * Describes the game board.
	 */
	private void describeGameBoard() {
		System.out.println("Game Board: " + this.currentGameBoard.toString());
	}
}