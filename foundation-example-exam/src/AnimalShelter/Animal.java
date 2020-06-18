package AnimalShelter;

public class Animal {
    protected String name;
    protected String ownerName;
    protected boolean isHealthy;
    protected Integer healCost;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getHealCost() {
        return healCost;
    }

    public void setHealCost(Integer healCost) {
        this.healCost = healCost;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void heal() {
        this.isHealthy = true;
    }

    public boolean isAdoptable() {
        if (this.isHealthy) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (!this.isHealthy) {
            return this.name + " is not healthy (" + this.healCost + "€), and not adoptable.";
        } else {
            return this.name + " is healthy and adoptable.";
        }
    }
}