package models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ToasterTest {

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Toaster toasty= new Toaster();
        toasty.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, toasty.getName());
    }
        @Test // (1)
        public void constructorTest(){

            int expectedId = 6;
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            int expectedSport = 2;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            // (3)
            Toaster toasty = new Toaster(expectedId, expectedName, expectedBrand,
                    expectedSport, expectedQty,expectedPrice);

            // (4)
            Assertions.assertEquals(expectedId, toasty.getId());
            Assertions.assertEquals(expectedName, toasty.getName());
            Assertions.assertEquals(expectedBrand, toasty.getBrand());
            Assertions.assertEquals(expectedSport, toasty.getToastSlots());
            Assertions.assertEquals(expectedQty, toasty.getQty());
            Assertions.assertEquals(expectedPrice, toasty.getPrice());
        }
    }

