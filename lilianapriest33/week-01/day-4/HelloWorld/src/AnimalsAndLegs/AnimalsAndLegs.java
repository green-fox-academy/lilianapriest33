package AnimalsAndLegs;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chickens on the farm: ");
        int userinput1 = scanner.nextInt();

        System.out.print("Enter number of pigs on the farm: ");
        int userinput2 = scanner.nextInt();

        System.out.println((userinput1*4) + (userinput2*4));
    }
}
