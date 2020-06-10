package Exercises.FleetOfThings;

public class Main {
    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing thingone = new Thing("Get milk");
        Thing thingtwo = new Thing("Remove the obstacles");
        Thing thingthree = new Thing("Stand up");
        Thing thingfour = new Thing("Eat lunch");
        thingthree.complete();
        thingfour.complete();

        fleet.add(thingone);
        fleet.add(thingtwo);
        fleet.add(thingthree);
        fleet.add(thingfour);

        System.out.println(fleet.toString());
    }
}