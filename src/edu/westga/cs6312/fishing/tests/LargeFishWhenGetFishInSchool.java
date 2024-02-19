package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * Test class for the LargeFish class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class LargeFishWhenGetFishInSchool {

	/**
	 * Tests the getNumberOfFishInSchool method for LargeFish.
	 */
	@Test
	public void shouldConfirmNumberOfFishInSchool() {
		LargeFish newLargeFish = new LargeFish();
		assertEquals(50, newLargeFish.getNumberOfFishInSchool());
	}
}