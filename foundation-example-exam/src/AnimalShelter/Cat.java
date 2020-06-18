package AnimalShelter;

public class Cat extends Animal {

    public Cat() {
        super();
        this.healCost = (int) (Math.random() * 5 + 1);
        this.name = "Cat";
    }

    public Cat(String name) {
        this.name = name;
    }
}