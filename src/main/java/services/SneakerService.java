package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;  // (1)

    private List<Sneaker> inventory = new ArrayList<>();  // (2)


    public  Sneaker create(String expectedName, String expectedBrand, String expectedSport, float expectedSize, int expectedQty, float expectedPrice) {
        Sneaker sneaker = new Sneaker(nextId++, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        inventory.add(sneaker);
        return sneaker;
    }

    public Sneaker FindSneaker(int i) {
        for (Sneaker s : inventory) {
            if(s.getId() == i){
                return s;
            }

        }
        return null;
    }


    public Sneaker[] findALL() {
        return  inventory.toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id) {
        for(Sneaker s : inventory){
            if (s.getId() == id){
                inventory.remove(s);
                return true;
            }
        }

        return false;
    }
}
