package Functions.Factorio;

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int f = scanner.nextInt();

        System.out.println(DeFacto(f));
    }
    public static int DeFacto (int e){
        int facto = 1;
        for (int i = 1; i <= e; i++){
            facto *= i;
        }
        return facto;
    }
}

// - Create a function called `factorio`
//   that returns it's input's factorial