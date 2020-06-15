package NewGardenExercise;

public class Main {
    public static void main(String[] args) {

        Garden myGarden = new Garden();
        myGarden.gardenState();

        myGarden.addWater(40);
        myGarden.gardenState();

        myGarden.addWater(70);
        myGarden.gardenState();
    }
}