package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.Angler;

/**
 * Test class for the Angler class.
 * 
 * @author Your Name
 * @version Date
 */
public class AnglerWhenGetMoney {

	/**
	 * Test the getMoneyUnitsLeft method for Angler.
	 */
	@Test
	public void shouldConfirmCorrectMoneyUnits() {
		Angler angler = new Angler();
		assertEquals(100, angler.getMoneyUnitsLeft());
	}
}