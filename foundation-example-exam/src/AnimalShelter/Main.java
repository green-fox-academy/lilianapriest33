package AnimalShelter;

public class Main {
    public static void main(String[] args) {
        Cat cirmi = new Cat();
        Dog bloki = new Dog();
        Parrot gyurika = new Parrot();

        Shelter shelter = new Shelter();
        shelter.rescue(cirmi);
        shelter.rescue(bloki);
        shelter.rescue(gyurika);

        shelter.heal();

        shelter.addAdopter("Mary");
        shelter.addAdopter("John");

        shelter.earnDonation(20);

        shelter.findNewOwner();

        System.out.println(shelter.toString());
    }
}