package GardenExercise;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Tree> trees = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();

    public Garden() {
    }
    public void addTree(Tree tree) {
        this.trees.add(tree);
    }
    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }
    public void waterStatus() {
        this.needsWater(Plant);
    }

}
