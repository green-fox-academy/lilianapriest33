package GardenExercise;

public class Flower extends Plant{
    private double waterAbsorption;

    public Flower () {
        this.waterAbsorption = 0.75;
        this.minWaterNeed = 5;
    }
    @Override
    protected String specificNeedsWater (){
        if (waterAmount <= minWaterNeed)
        return "The " + this.color + " flower needs water.";
    }


}
