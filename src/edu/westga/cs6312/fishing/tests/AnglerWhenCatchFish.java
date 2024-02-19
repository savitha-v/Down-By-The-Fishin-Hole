package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.Angler;

/**
 * Test class for the Angler class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class AnglerWhenCatchFish {

	/**
	 * Test the catchFish method for Angler with a valid increment.
	 */
	@Test
	public void shouldConfirmCorrectNumberOfFishCaught() {
		Angler newAngler = new Angler();
		newAngler.catchFish(5);
		assertEquals(5, newAngler.getNumberOfFishCaught());
	}

	/**
	 * Test the catchFish method for Angler with a negative increment.
	 */
	@Test
	public void shouldThrowExceptionForNegativeIncrement() {
		Angler newAngler = new Angler();
		assertThrows(IllegalArgumentException.class, () -> {
			newAngler.catchFish(-5);
		});
	}
}