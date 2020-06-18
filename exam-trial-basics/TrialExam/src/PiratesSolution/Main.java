package PiratesSolution;

public class Main {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Jack", 50, true, true);
        Pirate pirate2 = new Pirate("Bob", 0, false, false);
        Pirate pirate3 = new Pirate("Joe", 10, true, true);
        Pirate pirate4 = new Pirate("Jill", 25, false, false);
        Pirate pirate5 = new Pirate("Mary", 10, true, false);
        Pirate pirate6 = new Pirate("Bill", 7, true, false);


        Ship ship = new Ship();
        ship.addPirate(pirate1);
        ship.addPirate(pirate2);
        ship.addPirate(pirate3);
        ship.addPirate(pirate4);
        ship.addPirate(pirate5);
        ship.addPirate(pirate6);

        System.out.println(ship.getPoorPirates());
        System.out.println(ship.getGold());
    }
}
