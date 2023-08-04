package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakersTest {
    @Test
    public void setIdTest() {
        // given (1)
        int expected = 0212;

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Dunks";

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }
    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Cheerleading";

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 8;

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }
    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 12;

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }
    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 200F;

        // when (2)
        Sneakers testSneaker = new Sneakers();
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }
}