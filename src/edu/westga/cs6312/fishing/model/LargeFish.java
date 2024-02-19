package edu.westga.cs6312.fishing.model;

import java.util.Random;

/**
 * A subclass representing a large fish type.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class LargeFish extends FishType {

	/**
	 * Constructs a LargeFish with 50 fish in the school.
	 */
	public LargeFish() {
		super(50);
	}

	/**
	 * Returns the cost to fish this type of fish.
	 * 
	 * @return The cost to fish this type of fish.
	 */
	@Override
	public int costToFish() {
		return 50;
	}

	/**
	 * Removes a random number of fish from the school, up to all fish present.
	 * 
	 * @return The number of fish caught.
	 */
	@Override
	public int catchFish() {
		Random randomGenerator = new Random();
		int numberOfFishCaught = randomGenerator.nextInt(this.getNumberOfFishInSchool() + 1);
		super.removeFish(numberOfFishCaught);
		return numberOfFishCaught;
	}

	/**
	 * Provides a string representation of this LargeFish describing the number of
	 * large fish in the school.
	 * 
	 * @return A string representation of this LargeFish.
	 */
	@Override
	public String toString() {
		return "large fish with " + super.getNumberOfFishInSchool() + " fish in the school.";
	}
}
