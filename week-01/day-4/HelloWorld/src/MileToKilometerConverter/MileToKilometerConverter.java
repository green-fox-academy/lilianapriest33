package MileToKilometerConverter;

import java.util.Scanner;

public class MileToKilometerConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        float userinput = scanner.nextFloat();

        System.out.println(userinput+" miles = "+(userinput*1.609344)+" kilometres");
    }
}
