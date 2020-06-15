package GardenExercise;

public class Plant {
    protected String color;
    protected double waterAmount;
    protected boolean needsWater;
    protected int minWaterNeed;

    public Plant(String color, double waterAmount, boolean needsWater, int minWaterNeed) {
        this.color = color;
        this.waterAmount = waterAmount;
        this.needsWater = needsWater;
        this.minWaterNeed = minWaterNeed;
    }

    public Plant() {
        this.color = "green";
        this.waterAmount = 50;
        this.needsWater = false;
    }

    public boolean NeedsWater() {
        return needsWater;
    }

    protected String specificNeedsWater() {
        return " ";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getMinWaterNeed() {
        return minWaterNeed;
    }

    public void setMinWaterNeed(int minWaterNeed) {
        this.minWaterNeed = minWaterNeed;
    }
    public boolean wateringPlants() {
        if (waterAmount <= minWaterNeed) {
            needsWater = true;
            return needsWater;
        } else {
            needsWater = false;
            return needsWater;
        }
    }
}




