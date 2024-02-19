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
public class SmallFishWhenGetFishInSchool {

	/**
	 * Test the getNumberOfFishInSchool method for SmallFish.
	 */
	@Test
	public void shouldConfirmCorrectNumberOfFishInSchool() {
		SmallFish newSmallFish = new SmallFish();
		assertEquals(100, newSmallFish.getNumberOfFishInSchool());
	}
}