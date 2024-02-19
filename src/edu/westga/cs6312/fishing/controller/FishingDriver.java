package edu.westga.cs6312.fishing.controller;

import edu.westga.cs6312.fishing.model.GameBoard;
import edu.westga.cs6312.fishing.view.FishingTUI;

/**
 * The FishingDriver class contains the main method to run the fishing game
 * application.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class FishingDriver {

	/**
	 * The entry point of the application.
	 * 
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args) {
		GameBoard newGameBoard = new GameBoard();
		FishingTUI newTUI = new FishingTUI(newGameBoard);
		newTUI.run();
	}
}