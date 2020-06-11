package Cuboid;

public class Cuboid {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 10.0;
        double c = 10.0;

        int surfaceArea = (int) (2 * ((a * b) + (a * c) + (b * c)));
        System.out.println("The cuboid's surface area is: " + surfaceArea);

        int volume = (int) (a * b * c);
        System.out.println("The cuboid's volume is: " + volume);
    }
}
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// Surface Area: 600
// Volume: 1000