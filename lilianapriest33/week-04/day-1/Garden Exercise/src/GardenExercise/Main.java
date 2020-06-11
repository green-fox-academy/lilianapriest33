package GardenExercise;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Garden myGarden = new Garden();

        Flower yellow = new Flower("yellow", 0);
        myGarden.add(yellow);

        Flower blue = new Flower("blue", 0);
        myGarden.add(blue);

        Tree purple = new Tree("purple", 0);
        myGarden.add(purple);

        Tree orange = new Tree("orange", 0);
        myGarden.add(orange);

        myGarden.waterAmount();
        myGarden.addWater((double) 40);
        myGarden.waterStatus();
        myGarden.addWater((double) 70);

        myGarden.waterStatus();
        
    }
}
