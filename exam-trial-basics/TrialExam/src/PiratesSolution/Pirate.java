package PiratesSolution;

public class Pirate {
    protected String name;
    protected Integer goldAmount;
    protected Integer healthPoints;
    protected boolean hasWoodenLeg;
    protected boolean isCaptain;

    public Pirate(String name, Integer goldAmount, boolean hasWoodenLeg, boolean isCaptain) {
        this.name = name;
        this.goldAmount = goldAmount;
        this.healthPoints = 10;
        this.hasWoodenLeg = hasWoodenLeg;
        this.isCaptain = isCaptain;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public String getName() {
        return name;
    }

    public Integer getGoldAmount() {
        return goldAmount;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public boolean hasWoodenLeg() {
        return hasWoodenLeg;
    }

    public void work() {
        if (this.isCaptain) {
            this.goldAmount += 10;
            this.healthPoints -= 5;
        } else {
            this.goldAmount++;
            this.healthPoints--;
        }
    }

    public void party() {
        if (this.isCaptain) {
            this.healthPoints += 10;
        } else {
            this.healthPoints++;
        }
    }

    @Override
    public String toString() {
        if (this.hasWoodenLeg) {
            return "Hello, I'm " + this.name + ". I have a wooden leg and " + this.goldAmount + " golds.";
        } else {
            return "Hello, I'm " + this.name + ". I still have my real legs and " + this.goldAmount + " golds.";
        }
    }
}
