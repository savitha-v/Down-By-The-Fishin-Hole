package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.Angler;

/**
 * Test class for the Angler class. Tests constructor and toString method.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class AnglerWhenCreateAngler {

	/**
	 * Test the constructor and toString method for Angler.
	 */
	@Test
	public void shouldConfirmConstructorAndToString() {
		Angler angler = new Angler();
		assertEquals("Angler with 100 money units and 0 fish.", angler.toString());
	}
}