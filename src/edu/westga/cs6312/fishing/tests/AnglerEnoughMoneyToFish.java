package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.Angler;
import edu.westga.cs6312.fishing.model.FishingHole;
import edu.westga.cs6312.fishing.model.GameBoard;
import edu.westga.cs6312.fishing.view.FishingTUI;

/**
 * Test class for the scenario where the angler has enough money to fish.
 * 
 * @author Your Name
 * @version 1.0
 */
public class AnglerEnoughMoneyToFish {

	/**
	 * Test the fishInFishingHole method when angler has enough money.
	 */
	@Test
	public void shouldReduceMoneyAndCatchFish() {
		FishingHole fishingHole = new FishingHole(1, new SmallFish());
		Angler angler = new Angler();
		angler.payToFish(50); // Assuming 50 money units are enough
		GameBoard gameBoard = new GameBoard(fishingHole, angler);
		FishingTUI fishingTUI = new FishingTUI(gameBoard);

		fishingTUI.fishInFishingHole();

		assertEquals(50, angler.getMoneyUnitsLeft());
		assertEquals(1, angler.getNumberOfFishCaught());
	}
}