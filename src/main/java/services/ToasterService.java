package services;

import models.Toaster;

import java.util.ArrayList;
import java.util.List;

public class ToasterService {
    private static int nextId = 1;  // (1)

    private List<Toaster> inventory = new ArrayList<>();  // (2)

    public Toaster create(String name, String brand, int toasterSlots, int quantity, float price) {

        // (2)
        Toaster createdSneaker = new Toaster(nextId++, name, brand, toasterSlots, quantity, price);

        // (3)
        inventory.add(createdSneaker);

        // (4)
        return createdSneaker;
    }
}
