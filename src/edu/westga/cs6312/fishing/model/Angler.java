package edu.westga.cs6312.fishing.model;

/**
 * A class representing an angler participating in fishing activities.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class Angler {
	private int moneyUnitsLeft;
	private int numberOfFishCaught;

	/**
	 * 0-parameter constructor creating an Angler with 100 money units and no fish
	 * caught initially.
	 */
	public Angler() {
		this.moneyUnitsLeft = 100;
		this.numberOfFishCaught = 0;
	}

	/**
	 * Gets the number of money units left for the angler.
	 * 
	 * @return The number of money units left.
	 */
	public int getMoneyUnitsLeft() {
		return this.moneyUnitsLeft;
	}

	/**
	 * Gets the total number of fish caught by the angler.
	 * 
	 * @return The total number of fish caught.
	 */
	public int getNumberOfFishCaught() {
		return this.numberOfFishCaught;
	}

	/**
	 * Pays the specified number of money units to fish at the fishing hole.
	 * 
	 * @param moneyUnitsToPay The number of money units to be paid.
	 * @throws IllegalArgumentException if moneyUnitsToPay is negative or exceeds
	 *                                  moneyUnitsLeft.
	 */
	public void payToFish(int moneyUnitsToPay) {
		if (moneyUnitsToPay < 0) {
			throw new IllegalArgumentException("Invalid amount to pay for fishing: " + moneyUnitsToPay);
		}
		if (moneyUnitsToPay > this.moneyUnitsLeft) {
			throw new IllegalArgumentException("Not enough money units left to pay for fishing: " + moneyUnitsToPay);
		}
		this.moneyUnitsLeft -= moneyUnitsToPay;
	}

	/**
	 * Increments the total number of fish caught by the specified amount.
	 * 
	 * @param numberOfFishIncrement The number of fish caught.
	 * @throws IllegalArgumentException if numberOfFishIncrement is negative.
	 */
	public void catchFish(int numberOfFishIncrement) {
		if (numberOfFishIncrement < 0) {
			throw new IllegalArgumentException("Invalid number of fish caught: " + numberOfFishIncrement);
		}
		this.numberOfFishCaught += numberOfFishIncrement;
	}

	/**
	 * Returns a string representation of the angler, including their money units
	 * left and the number of fish caught.
	 * 
	 * @return A string representation of the angler.
	 */
	@Override
	public String toString() {
		return "Angler with " + this.moneyUnitsLeft + " money units and " + this.numberOfFishCaught + " fish.";
	}
}