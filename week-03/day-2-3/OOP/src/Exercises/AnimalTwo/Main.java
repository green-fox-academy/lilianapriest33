package DataStructures.AnimalTwo;

public class Main {
    public static void main(String[] args) {

        AnimalTwo cat = new AnimalTwo(100, 100);

        cat.eat();
        System.out.println("After eating, hunger level is: " + cat.hunger);

        cat.drink();
        System.out.println("After drinking, thirst level is: " + cat.thirst);

        cat.play();
        System.out.println("After playing, hunger level is: " + cat.hunger + " and thirst level is: " + cat.thirst);

    }
}