package GardenExercise;

public class Main {
    public static void main (String[] args) {
        Garden myGarden = new Garden();

        Flower yellow = new Flower("yellow", 0);
        myGarden.addFlower(yellow);

        Flower blue = new Flower("blue", 0);
        myGarden.addFlower(blue);

        Tree purple = new Tree("purple", 0);
        myGarden.addTree(purple);

        Tree orange = new Tree("orange", 0);
        myGarden.addTree(orange);

        myGarden.addWater((double) 40);
        myGarden.waterStatus();
        myGarden.addWater((double) 70);

        myGarden.waterStatus();
        
    }
}
