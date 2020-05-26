package Functions.Sum;

import java.util.Scanner;

public class Sum {
    public static void main (String[]args){

        Scanner sum = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = sum.nextInt();

        System.out.println("Sum of numbers from 0 to " + number + ": " + sum(number));
    }
    public static int sum(int d){
        int c = 0;
        for (int i =0; i <= d; i++){
            c += i;
        }
        return c;
    }
}

// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter