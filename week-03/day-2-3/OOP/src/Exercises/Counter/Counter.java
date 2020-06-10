package Exercises.Counter;

public class Counter {

    private int defaultValue;
    private int initialValue;

    public Counter (int defaultValue, int initialValue) {
        this.defaultValue = defaultValue;
        this.initialValue = initialValue;
    }

    public void add(int i) {    //add whole number
        this.defaultValue = defaultValue + i;
        System.out.println(+i + " added to the number");
    }

    public void add() {     //increasing value by 1
        this.defaultValue++;
        System.out.println("Increased by 1");
    }

    public void get() {      //current value
        System.out.println("The current number is: " + defaultValue);
    }

    public void reset() {   //reset value to initial value = zero value
        this.defaultValue = this.initialValue;
        System.out.println("Reset to " + initialValue);
    }
}