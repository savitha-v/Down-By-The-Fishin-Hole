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
	private FishingHole[] fishingHoles;
	private Angler angler;
	private int currentLocation;

	/**
	 * Constructs a GameBoard object, initializing the game board for play.
	 */
	public GameBoard() {
		this.setupFishingHoles();
	}

	/**
	 * Sets up the fishing holes on the board and initializes the angler's location.
	 */
	private void setupFishingHoles() {
		this.fishingHoles = new FishingHole[10];
		for (int holeNumber = 0; holeNumber < this.fishingHoles.length; holeNumber++) {
			this.fishingHoles[holeNumber] = new FishingHole(holeNumber);
		}
		this.angler = new Angler();
		this.currentLocation = 0;
	}

	/**
	 * Returns the Angler object.
	 * 
	 * @return The angler on the game board.
	 */
	public Angler getAngler() {
		return this.angler;
	}

	/**
	 * Returns the current FishingHole where the Angler is located.
	 * 
	 * @return The current fishing hole.
	 */
	public FishingHole getCurrentFishingHole() {
		return this.fishingHoles[this.currentLocation];
	}

	/**
	 * Returns a string representation of the game board.
	 * 
	 * @return A string detailing the angler's status and current location.
	 */
	@Override
	public String toString() {
		return "Angler's Status: " + this.angler.toString() + "\nCurrent Location: Fishing Hole "
				+ this.currentLocation;
	}
}