package AnimalShelter;

public class Dog extends Animal {

    public Dog() {
        super();
        this.name = "Dog";
        this.healCost = (int) (Math.random() * 6 + 2);
    }

    public Dog(String name) {
        this.name = name;
    }
}