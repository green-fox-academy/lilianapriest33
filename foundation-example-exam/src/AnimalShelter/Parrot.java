package AnimalShelter;

public class Parrot extends Animal {

    public Parrot() {
        super();
        this.healCost = (int) (Math.random() * 5 + 5);
        this.name = "Parrot";
    }

    public Parrot(String name) {
        this.name = name;
    }
}