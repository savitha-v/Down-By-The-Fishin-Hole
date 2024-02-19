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
public class AnglerWhenPayToFish {

	/**
	 * Test the payToFish method for Angler with a valid amount.
	 */
	@Test
	public void shouldConfirmPaymentAndUpdatedMoneyUnits() {
		Angler newAngler = new Angler();
		newAngler.payToFish(50);
		assertEquals(50, newAngler.getMoneyUnitsLeft());
	}

	/**
	 * Test the payToFish method for Angler with a negative amount.
	 */
	@Test
	public void shouldThrowExceptionForNegativeAmount() {
		Angler newAngler = new Angler();
		assertThrows(IllegalArgumentException.class, () -> {
			newAngler.payToFish(-50);
		});
	}

	/**
	 * Test the payToFish method for Angler with an exceeding amount.
	 */
	@Test
	public void shouldThrowExceptionForExceedingAmount() {
		Angler newAngler = new Angler();
		assertThrows(IllegalArgumentException.class, () -> {
			newAngler.payToFish(150);
		});
	}
}
