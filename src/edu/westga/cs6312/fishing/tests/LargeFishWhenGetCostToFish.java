package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * Test class for the LargeFish class costToFish method.
 * 
 * @author [Your Name]
 * @version [Date]
 */
public class LargeFishWhenGetCostToFish {

	/**
	 * Tests the costToFish method for LargeFish.
	 */
	@Test
	public void shouldConfirmCostToFish() {
		LargeFish newLargeFish = new LargeFish();
		assertEquals(50, newLargeFish.costToFish());
	}
}