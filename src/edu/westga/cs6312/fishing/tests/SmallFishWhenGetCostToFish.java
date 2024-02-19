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
public class SmallFishWhenGetCostToFish {

	/**
	 * Test the costToFish method for SmallFish.
	 */
	@Test
	public void shouldConfirmCorrectCostToFish() {
		SmallFish newSmallFish = new SmallFish();
		assertEquals(25, newSmallFish.costToFish());
	}
}