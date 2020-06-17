/*package Pirates;

public class Pirate {
    protected String name;
    protected int goldAmount;
    protected int healthPoint;
    protected boolean isCaptain;
    protected boolean hasWoodenLeg;

    //constructor
    protected Pirate(String name, int goldAmount, int healthPoint, boolean hasWoodenLeg) {
        this.name = name;
        this.goldAmount = goldAmount;
        this.healthPoint = healthPoint;
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public int getGoldAmount() {
        return this.goldAmount;
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }

    public boolean hasWoodenLeg() {
        return hasWoodenLeg;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    //methods
    public int work() {
        if (isCaptain) {
            this.goldAmount += 10;
            this.healthPoint -= 5;
            return goldAmount;
            return healthPoint;
        }
        else {
            this.goldAmount += 1;
            this.healthPoint -= 1;
            return goldAmount;
            return healthPoint;
        }
    }

    public int party() {
        if (isCaptain) {
            this.healthPoint += 10;
            return this.healthPoint;
        }
        else {
            this.healthPoint += 1;
            return healthPoint;
        }

        public String toString() {
            if (hasWoodenLeg) {
                return "Hello, I'm " + name + " I have a wooden leg and " + goldAmount + " golds.";
            }
            else {
                return "Hello, I'm " + name + " I still have my real legs and " + goldAmount + " golds.";
            }
        }
    }
}*/