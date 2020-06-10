package SecondsInADay;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 30;
        int currentSeconds = 20;

        /* Write a program that prints the remaining seconds (as an integer) from a
        day if the current time is represented by the variables */

        int currentTimeInSeconds = (currentSeconds + (currentMinutes * 60) + (currentHours * 60 * 60));
        System.out.println("There are " + currentTimeInSeconds + " more remaining seconds of the day.");
    }
}
