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
	private FishingHole[] fishingHolesArray;
	private Angler currentAngler;
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
		this.fishingHolesArray = new FishingHole[10];
		for (int holeNumber = 0; holeNumber < this.fishingHolesArray.length; holeNumber++) {
			this.fishingHolesArray[holeNumber] = new FishingHole(holeNumber);
		}
		this.currentAngler = new Angler();
		this.currentLocation = 0;
	}

	/**
	 * Returns the Angler object.
	 * 
	 * @return The angler on the game board.
	 */
	public Angler getAngler() {
		return this.currentAngler;
	}

	/**
	 * Returns the current FishingHole where the Angler is located.
	 * 
	 * @return The current fishing hole.
	 */
	public FishingHole getCurrentFishingHole() {
		return this.fishingHolesArray[this.currentLocation];
	}

	/**
	 * Moves the current angler to the FishingHole that is one above the current
	 * location. If the angler is currently at the top-most FishingHole (position
	 * 0), then this method will move the player to the bottom-most FishingHole (to
	 * simulate a world that 'wraps').
	 */
	public void moveUp() {
		if (this.currentLocation == 0) {
			this.currentLocation = this.fishingHolesArray.length - 1;
		} else {
			this.currentLocation--;
		}
	}

	/**
	 * Moves the current angler one FishingHole down. If the angler is currently at
	 * the bottom-most FishingHole, then this method will move the player to the top
	 * FishingHole (to simulate a world that 'wraps').
	 */
	public void moveDown() {
		if (this.currentLocation == this.fishingHolesArray.length - 1) {
			this.currentLocation = 0;
		} else {
			this.currentLocation++;
		}
	}

	/**
	 * Returns a string representation of the game board.
	 * 
	 * @return A string detailing the angler's status and current location.
	 */
	@Override
	public String toString() {
		StringBuilder boardDescription = new StringBuilder();
		for (int holeNumber = 0; holeNumber < this.fishingHolesArray.length; holeNumber++) {
			boardDescription.append("Fishing hole at [").append(holeNumber).append("] containing ");
			if (this.fishingHolesArray[holeNumber].getCurrentFishType() == null) {
				boardDescription.append("no fish.");
			} else {
				boardDescription.append(this.fishingHolesArray[holeNumber].getCurrentFishType().toString());
			}
			boardDescription.append("\n");
		}
		boardDescription.append("The Angler with ").append(this.currentAngler.getMoneyUnitsLeft())
				.append(" money units and ").append(this.currentAngler.getNumberOfFishCaught())
				.append(" fish is at fishing hole [").append(this.currentLocation).append("].");
		return boardDescription.toString();
	}
}