package conditionals;

import java.util.Scanner;

    public class PartyIndicator {
        public static void main(String[] args){
            /* Write a program that asks for two numbers
            The first number represents the number of girls that comes to a party, the
            second the boys */
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many girls are coming to the party?");
    int numGirls = scanner.nextInt();

    System.out.println("How many boys are coming to the party?");
    int numBoys = scanner.nextInt();

    int sum = numBoys + numGirls;

    if ((numBoys == numGirls) && (sum >= 20)){
        System.out.println("The party is excellent!");

    } else if ((numBoys != numGirls) && (sum >= 20)){
        System.out.println("Quite cool party!");

    } else if (numGirls == 0 ){
        System.out.println("Sausage party");

    } else  {
        System.out.println("Average party...");
    }
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
}
}
