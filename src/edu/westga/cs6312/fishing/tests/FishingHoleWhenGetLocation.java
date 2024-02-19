package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.fishing.model.FishingHole;

/**
 * Test class for the FishingHole class.
 * 
 * @author Savitha Venkatesh
 * @version 02/18/2024
 */
public class FishingHoleWhenGetLocation {

    /**
     * Test the getLocation method for FishingHole with a positive location.
     */
    @Test
    public void shouldConfirmCorrectLocationForPositiveLocation() {
        FishingHole newFishingHole = new FishingHole(5);
        assertEquals("Fishing hole at [5]", newFishingHole.getLocation());
    }

    /**
     * Test the getLocation method for FishingHole with a negative location.
     */
    @Test
    public void shouldConfirmCorrectLocationForNegativeLocation() {
        FishingHole newFishingHole = new FishingHole(-2);
        assertEquals("Fishing hole at [-2]", newFishingHole.getLocation());
    }
}
