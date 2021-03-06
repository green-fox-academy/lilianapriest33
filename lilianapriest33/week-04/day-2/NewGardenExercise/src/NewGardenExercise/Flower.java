package NewGardenExercise;

public class Flower extends Plant{
    public Flower (String color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Flower";
    }

    @Override
    public double getNeededWater() {
        return 5;
    }

    @Override
    public double getWaterAbsorption() {
        return 0.75;
    }

    @Override
    public double getWaterAmount() {
        return this.waterAmount;
    }

}
