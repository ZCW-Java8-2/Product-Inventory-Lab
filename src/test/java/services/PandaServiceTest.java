package services;

import models.Pandas;
import models.Toaster;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PandaServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        int expectedSport = 2;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        PandaService pandiService = new PandaService();
        Pandas testPandi = pandiService.create(expectedName, expectedBrand,
                expectedSport, expectedQty, expectedPrice);

        // (3)
        int actualId = testPandi.getId();
        String actualName = testPandi.getName();
        String actualBrand = testPandi.getSpecies();
        int actualSport = testPandi.getAge();
        int actualQty = testPandi.getQty();
        float actualPrice = testPandi.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

}