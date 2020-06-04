package DataStructures.Animal;

public class Animal {
    private int hunger;
    private int thirst;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        this.hunger--;
        System.out.println("After eating, hunger level is: " + hunger);
    }

    public void drink() {
        this.thirst--;
        System.out.println("After drinking, thirst level is: " + thirst);
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        System.out.println("After playing, hunger level is: " + hunger + " and thirst level is: " + thirst);
    }
}
