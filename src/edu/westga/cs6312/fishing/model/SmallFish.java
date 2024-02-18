package edu.westga.cs6312.fishing.model;

/**
 * A subclass representing a small fish type.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class SmallFish extends FishType {

	/**
	 * Constructs a SmallFish with 100 fish in the school.
	 */
	public SmallFish() {
		super(100);
	}

	/**
	 * Returns the cost to fish this type of fish.
	 * 
	 * @return The cost to fish this type of fish.
	 */
	@Override
	public int costToFish() {
		return 25;
	}

	/**
	 * Removes 50 fish from the school, or removes all fish if there are fewer than
	 * 50 fish present.
	 * 
	 * @return The number of fish caught.
	 */
	@Override
	public int catchFish() {
		int numberOfFishCaught = Math.min(super.getNumberOfFishInSchool(), 50);
		super.removeFish(numberOfFishCaught);
		return numberOfFishCaught;
	}

	/**
	 * Provides a string representation of this SmallFish describing the number of
	 * small fish in the school.
	 * 
	 * @return A string representation of this SmallFish.
	 */
	@Override
	public String toString() {
		return "Number of Small Fish in School: " + super.getNumberOfFishInSchool();
	}
}