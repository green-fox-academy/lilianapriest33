package Functions.Sum;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    public static int sum(int until) {
        int sumOfNumbers = 0;
        for (int i = 0; i < until; i++) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }
}

// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter