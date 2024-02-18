package edu.westga.cs6312.fishing.model;

/**
 * A class representing the state of the game board. The GameBoard class keeps
 * track of FishingHole objects, an Angler object, and the current location of
 * the Angler in the game.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class GameBoard {
	private static final int NUMBER_OF_FISHINGHOLES = 10;
	private FishingHole[] fishingHolesArray;
	private Angler currentAngler;
	private int currentLocation;

	/**
	 * Constructs a GameBoard object and sets up the game board for play.
	 */
	public GameBoard() {
		this.setupFishingHoles();
	}

	private void setupFishingHoles() {
		this.currentAngler = new Angler();
		this.fishingHolesArray = new FishingHole[NUMBER_OF_FISHINGHOLES];
		for (int holeNumber = 0; holeNumber < NUMBER_OF_FISHINGHOLES; holeNumber++) {
			this.fishingHolesArray[holeNumber] = new FishingHole(holeNumber);
		}
		this.currentLocation = 0;
	}

	/**
	 * Returns the Angler object.
	 * 
	 * @return The Angler object.
	 */
	public Angler getAngler() {
		return this.currentAngler;
	}

	/**
	 * Returns the current location of the Angler in the game.
	 * 
	 * @return The current location of the Angler.
	 */
	public int getCurrentLocation() {
		return this.currentLocation;
	}

	/**
	 * Returns a string representation of this GameBoard.
	 * 
	 * @return A string representation of this GameBoard.
	 */
	@Override
	public String toString() {
		String gameBoard = "GameBoard with " + NUMBER_OF_FISHINGHOLES + " fishing holes\n" + "Current Angler location: "
				+ this.currentLocation + "\n";
		for (int holeNumber = 0; holeNumber < NUMBER_OF_FISHINGHOLES; holeNumber++) {
			gameBoard += "FishingHole " + holeNumber + ": " + this.fishingHolesArray[holeNumber] + "\n";
		}
		return gameBoard;
	}

}