package Exercises.Counter;

public class Main {
    public static void main(String[] args) {

        Counter thisCounter = new Counter (0, 0);

        int i = 15;

        thisCounter.add(i);
        thisCounter.add();
        thisCounter.get();
        thisCounter.reset();
    }
}