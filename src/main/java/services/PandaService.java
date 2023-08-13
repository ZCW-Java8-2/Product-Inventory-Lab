package services;

import models.Pandas;
import models.Toaster;

import java.util.ArrayList;
import java.util.List;

public class PandaService {
    private static int nextId = 1;  // (1)

    private List<Pandas> inventory = new ArrayList<>();  // (2)

    public Pandas create(String name, String species, int age, int quantity, float price) {

        // (2)
        Pandas createdPanda = new Pandas(nextId++, name, species, age, quantity, price);

        // (3)
        inventory.add(createdPanda);

        // (4)
        return createdPanda;
    }
}
