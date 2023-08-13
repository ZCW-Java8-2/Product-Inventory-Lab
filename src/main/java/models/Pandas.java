package models;

public class Pandas {
    private int id;
    private String name;
    private String species ;
    private int age;
    private int qty;
    private float price;

    public Pandas() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Pandas(int id, String name, String species, int age, int qty, float price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.qty = qty;
        this.price = price;
    }
}
