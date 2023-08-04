package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {

    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        float actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker expected = sneakerService.create("joe", "nike", "soccer", 10, 3, 35.99f);

        Sneaker actual = sneakerService.FindSneaker(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAllTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker s1 = sneakerService.create("joe", "nike", "soccer", 10, 3, 35.99f);
        Sneaker s2 = sneakerService.create("bob", "ADIDAS", "FOOTBALL", 5,6, 37.99f);

        Sneaker[] expected = {s1, s2};
        Sneaker[] actual = sneakerService.findALL();

        Assertions.assertEquals(expected.length,actual.length);


    }
    @Test
    public void deleteTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker s1 = sneakerService.create("joe", "nike", "soccer", 10, 3, 35.99f);
        Sneaker s2 = sneakerService.create("bob", "ADIDAS", "FOOTBALL", 5,6, 37.99f);

       boolean expected =true;
       boolean actual = sneakerService.delete(s2.getId());

       Assertions.assertEquals(expected,actual);



    }


}