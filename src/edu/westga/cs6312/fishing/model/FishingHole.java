package edu.westga.cs6312.fishing.model;

import java.util.Random;

/**
 * A class representing an individual fishing hole in the game. The FishingHole
 * class keeps track of a FishType object present inside the FishingHole. If no
 * fish are present, then the FishType object will store null.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class FishingHole {
	private FishType currentFishType;
	private int location;

	/**
	 * Constructs a FishingHole with the specified location and sets up the
	 * FishingHole for play.
	 * 
	 * @param location The location of the FishingHole.
	 */
	public FishingHole(int location) {
		this.location = location;
		this.setupFishingHole();
	}

	/**
	 * Sets up the FishingHole by randomly determining if any FishType will be
	 * added. There is a 50% chance that fish should be added.
	 */
	private void setupFishingHole() {
		Random randomGenerator = new Random();
		if (randomGenerator.nextBoolean()) {
			this.currentFishType = this.addFish();
		}
	}

	/**
	 * Adds a random fish type (SmallFish or LargeFish) to the fishing hole with
	 * equal probability.
	 * 
	 * @return The FishType object added to the fishing hole.
	 */
	private FishType addFish() {
		Random randomGenerator = new Random();
		if (randomGenerator.nextBoolean()) {
			return new SmallFish();
		} else {
			return new LargeFish();
		}
	}

	/**
	 * Returns a string representation of the FishingHole's location.
	 * 
	 * @return A string representation of the FishingHole's location.
	 */
	public String getLocation() {
		return "Fishing hole at [" + this.location + "]";
	}

	/**
	 * Returns the FishType object currently in the FishingHole.
	 * 
	 * @return The FishType object currently in the FishingHole.
	 */
	public FishType getCurrentFishType() {
		return this.currentFishType;
	}

	/**
	 * Simulates a fishing attempt in this fishing hole. The success of the attempt
	 * depends on the presence and type of fish in the hole. If a fish type is
	 * present, it calculates the number of fish caught based on the specific fish
	 * type's catch logic. After a successful catch, the fish type in the hole is
	 * set to null, simulating that all fish of that type have been caught and
	 * removed from the hole.
	 *
	 * @return the number of fish caught during the fishing attempt. Returns 0 if no
	 *         fish are present or if the catch was unsuccessful.
	 */
	public int fish() {
		if (this.currentFishType == null) {
			System.out.println("No fish available to catch at this location.");
			return 0;
		} else {
			int fishCaught = this.currentFishType.catchFish();
			this.currentFishType = null;
			return fishCaught;
		}
	}

	/**
	 * Returns a string representation of this FishingHole.
	 * 
	 * @return A string representation of this FishingHole.
	 */
	@Override
	public String toString() {
		String fishDescription;
		if (this.currentFishType == null) {
			fishDescription = "no fish";
		} else {
			fishDescription = this.currentFishType.toString();
		}
		return "Fishing Hole at [" + this.location + "] containing " + fishDescription;
	}
}