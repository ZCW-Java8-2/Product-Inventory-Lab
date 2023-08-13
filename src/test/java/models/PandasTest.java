package models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class PandasTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Pandas redpanda= new Pandas();
        redpanda.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, redpanda.getName());
    }
    @Test // (1)
    public void constructorTest(){

        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedSpecies = "Adidas";
        int expectedAge = 2;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Toaster redpanda = new Toaster(expectedId, expectedName, expectedSpecies,
                expectedAge, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, redpanda.getId());
        Assertions.assertEquals(expectedName, redpanda.getName());
        Assertions.assertEquals(expectedSpecies, redpanda.getBrand());
        Assertions.assertEquals(expectedAge, redpanda.getToastSlots());
        Assertions.assertEquals(expectedQty, redpanda.getQty());
        Assertions.assertEquals(expectedPrice, redpanda.getPrice());
    }
}