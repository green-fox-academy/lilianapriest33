package MileToKilometerConverter;

import java.util.Scanner;

public class MileToKilometerConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double userinput = scanner.nextDouble();

        System.out.println(userinput+" miles = "+(userinput*1.609344)+" kilometres");
    }
}
