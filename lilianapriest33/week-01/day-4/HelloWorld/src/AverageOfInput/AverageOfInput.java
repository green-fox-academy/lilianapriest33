package AverageOfInput;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int ui1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int ui2 = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int ui3 = scanner.nextInt();

        System.out.print("Please enter the fourth number: ");
        int ui4 = scanner.nextInt();

        System.out.print("Please enter the fifth number: ");
        int ui5 = scanner.nextInt();

        System.out.println("Sum: " + (ui1+ui2+ui3+ui4+ui5) + ", Average: " + (ui1+ui2+ui3+ui4+ui5)/5);
    }
}
//Sum: 22, Average: 4.4