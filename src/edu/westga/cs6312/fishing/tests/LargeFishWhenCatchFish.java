package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * Test class for the LargeFish class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class LargeFishWhenCatchFish {

	/**
	 * Tests the catchFish method for LargeFish.
	 */
	@Test
	public void shouldConfirmFishAreCaught() {
		LargeFish newLargeFish = new LargeFish();
		int numberOfFishBefore = newLargeFish.getNumberOfFishInSchool();
		int fishCaught = newLargeFish.catchFish();
		assertTrue(numberOfFishBefore - fishCaught >= 0);
	}
}