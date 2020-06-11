package PirateExercise;

import java.util.Random;

public class Pirate {
    private String name;
    private int rumAmount;
    private boolean passedOut;
    private boolean dead;

    public Pirate(String name, int rumAmount) {
        this.name = name;
        this.rumAmount = rumAmount;
        passedOut = false;
        dead = false;
    }

    public String getName() {
        return this.name;
    }

    public int getRumAmount() {
        return this.rumAmount;
    }

    public boolean isDead() {
        return dead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drinkSomeRum() {
        if (dead){
            System.out.println("He's dead");
        }else {
            this.rumAmount++;
        }
    }

    public void howsItIsGoingMate() {
        if (dead){
            System.out.println("He's dead");
        }else if (rumAmount <= 4){
            System.out.println("Pour me anudder!");
        }else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
            rumAmount = 0;
        }
    }

    public void die() {
        this.dead = true;
    }

    public void brawl(Pirate otherpirate) {
        Random random = new Random();
        int chance = random.nextInt(3);

        if (chance == 1) {
            this.die();
            System.out.println("The pirate is dead.");

        } else if (chance == 2) {
            otherpirate.die();
            System.out.println("The other pirate is dead.");

        } else {
            this.passedOut = true;
            otherpirate.passedOut = true;
            System.out.println("Both pirates have passed out.");
        }
    }

    public String toString() {
        String state = " ";
        if (rumAmount != 0 && rumAmount <= 4) {
            state = "The pirate has drunk some rum.";
        } else if (passedOut) {
            state = "The pirate has passed out.";
        } else {
            state = "The pirate dead.";
        }
        return state;
    }
}