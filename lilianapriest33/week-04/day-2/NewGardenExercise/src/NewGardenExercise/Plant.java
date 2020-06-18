package NewGardenExercise;

public class Plant {
    protected String color;
    protected String needsWater;
    protected double waterAmount;
    protected double waterNeed;
    protected double waterAbsorption;

    public Plant(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return "Plant";
    }

    public double getNeededWater() {
        return this.waterNeed;
    }

    public double getWaterAbsorption() {
        return this.waterAbsorption;
    }

    public double getWaterAmount() {
        return this.waterAmount;
    }

    public String getNeedswater() {
        if (this.waterAmount<this.waterNeed) {
            return " needs water.";
        }
        return " doesn't need water.";
    }

    public String getName() {
        return "The " + this.getColor() + " " + this.getType() + this.getNeedswater();
    }

    public void water(int amount) {
        if (this.waterAmount<this.waterNeed) {
            this.waterAmount += amount * this.getWaterAbsorption();
        } else {
            this.needsWater = " doesn't need water.";
        }
    }
}