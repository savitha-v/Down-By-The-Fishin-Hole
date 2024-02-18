package edu.westga.cs6312.fishing.model;

/**
 * An abstract class representing the number of fish in a school initially and
 * after being fished out
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public abstract class FishType {
	private int numberOfFishInSchool;

	/**
	 * Constructs a FishType with the initial number of fish in the school.
	 * 
	 * @param initialFishCount The initial number of fish in the school.
	 * @throws IllegalArgumentException if initialFishCount is negative.
	 */
	public FishType(int initialFishCount) {
		if (initialFishCount < 0) {
			throw new IllegalArgumentException("Initial number of fish cannot be negative");
		}
		this.numberOfFishInSchool = initialFishCount;
	}

	/**
	 * Gets the number of fish currently in the school.
	 * 
	 * @return The number of fish currently in the school.
	 */
	public int getNumberOfFishInSchool() {
		return this.numberOfFishInSchool;
	}

	/**
	 * Removes the specified number of fish from the school.
	 * 
	 * @param numberOfFishToRemove The number of fish to be removed from the school.
	 * @throws IllegalArgumentException if numberOfFishToRemove is negative or
	 *                                  exceeds the number of fish in the school.
	 */
	public void removeFish(int numberOfFishToRemove) {
		if (numberOfFishToRemove < 0) {
			throw new IllegalArgumentException("Number of fish to remove cannot be negative");
		}
		if (numberOfFishToRemove > this.numberOfFishInSchool) {
			throw new IllegalArgumentException("Cannot remove more fish than available in the school");
		}
		this.numberOfFishInSchool -= numberOfFishToRemove;
	}

	/**
	 * Abstract method to catch fish.
	 * 
	 * @return The number of fish caught.
	 */
	public abstract int catchFish();

	/**
	 * Abstract method to get the cost associated with fishing this type of fish.
	 * 
	 * @return The cost associated with fishing this type of fish.
	 */
	public abstract int costToFish();

	/**
	 * Provides a string representation of this FishType that returns the number of
	 * fish in a school.
	 * 
	 * @return A string representation of this FishType.
	 */
	@Override
	public String toString() {
		return "Number of Fish in School: " + this.numberOfFishInSchool;
	}
}