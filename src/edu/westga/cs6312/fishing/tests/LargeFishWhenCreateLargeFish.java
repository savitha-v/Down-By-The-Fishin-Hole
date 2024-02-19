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
public class LargeFishWhenCreateLargeFish {

	/**
	 * Tests the constructor and toString method for LargeFish.
	 */
	@Test
	public void shouldConfirmConstructorAndToString() {
		LargeFish largeFish = new LargeFish();
		assertEquals("large fish with 50 fish in the school.", largeFish.toString());
	}
}