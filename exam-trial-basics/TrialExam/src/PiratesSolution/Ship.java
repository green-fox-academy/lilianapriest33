package PiratesSolution;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private ArrayList<Pirate> pirates = new ArrayList<>();

    public void addPirate(Pirate pirate) {
        if (!pirate.isCaptain()) {
            pirates.add(pirate);
        } else {
            boolean foundCaptain = false;
            for (int i = 0; i < pirates.size(); i++) {
                if (pirates.get(i).isCaptain()) {
                    foundCaptain = true;
                }
            }
            if (!foundCaptain) {
                pirates.add(pirate);
            } else {
                System.out.println("There is already a captain on the ship!");
            }
        }
    }

    public List<String> getPoorPirates() {
        List<String> poorPirates = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            if (pirates.get(i).hasWoodenLeg && pirates.get(i).getGoldAmount() < 15) {
                poorPirates.add(pirates.get(i).getName());
            }
        }
        return poorPirates;
    }

    public int getGold() {
        int sum = 0;
        for (int i = 0; i < pirates.size(); i++) {
            sum += pirates.get(i).getGoldAmount();
        }
        return sum;
    }
    public void lastDayOnTheShip() {
        for (int i = 0; i < pirates.size(); i++) {
            pirates.get(i).party();
        }
    }
    public void prepareForBattle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < pirates.size(); i++) {
                pirates.get(i).work();
            }
        }
        lastDayOnTheShip();
    }
}