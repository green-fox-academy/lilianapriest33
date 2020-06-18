package NewGardenExercise;

public class Tree extends Plant{
    public Tree(String color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Tree";
    }

    @Override
    public double getNeededWater() {
        return 10;
    }

    @Override
    public double getWaterAbsorption() {
        return 0.40;
    }

    @Override
    public double getWaterAmount() {
        return this.waterAmount;
    }
}