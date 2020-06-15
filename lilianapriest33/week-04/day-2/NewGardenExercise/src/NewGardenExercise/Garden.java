package NewGardenExercise;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> myGarden;

    public Garden() {
        myGarden = new ArrayList<>();
        Plant yellowFlower = new Flower("yellow");
        myGarden.add(yellowFlower);
        Plant blueFlower = new Flower("blue");
        myGarden.add(blueFlower);
        Plant purpleTree = new Tree("purple");
        myGarden.add(purpleTree);
        Plant orangeTree = new Tree("orange");
        myGarden.add(orangeTree);
    }

    public List<Plant> getGarden() {
        return this.myGarden;
    }

    public void gardenState() {
        for (int i = 0; i < this.getGarden().size(); i++) {
            System.out.println(this.getGarden().get(i).getName());
        }
        System.out.println();
    }

    public void addWater(int amount) {
        for (int i = 0; i < this.getGarden().size(); i++) {
            this.getGarden().get(i).water(amount / this.getGarden().size());
        }
    }
}