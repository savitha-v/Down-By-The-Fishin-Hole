package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.Angler;

/**
 * Test class for the Angler class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class AnglerWhenGetFishCaught {

	/**
	 * Test the getNumberOfFishCaught method for Angler.
	 */
	@Test
	public void shouldConfirmCorrectNumberOfFishCaught() {
		Angler newAngler = new Angler();
		assertEquals(0, newAngler.getNumberOfFishCaught());
	}
}