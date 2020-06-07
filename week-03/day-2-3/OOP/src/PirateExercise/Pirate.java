package PirateExercise;

public class Pirate {
    private String name;
    private int rumAmount;
    private boolean passedOut;

    public Pirate(String name, int rumAmount) {
        this.name = name;
        this.rumAmount = rumAmount;
    }

    public int drinkSomeRum() {
        this.rumAmount++;
        return rumAmount;
    }

    public String howsItIsGoingMate() {
        if (rumAmount <= 4) {
            System.out.println("Pur me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
        }
    }
}
