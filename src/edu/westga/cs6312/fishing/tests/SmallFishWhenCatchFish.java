package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * Test class for the SmallFish class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class SmallFishWhenCatchFish {

	/**
	 * Test the catchFish method for SmallFish.
	 */
	@Test
	public void shouldConfirmCorrectNumberOfFishCaught() {
		SmallFish newSmallFish = new SmallFish();
		int fishCaught = newSmallFish.catchFish();
		assertEquals(50, fishCaught);
		assertEquals(50, newSmallFish.getNumberOfFishInSchool());
	}
}