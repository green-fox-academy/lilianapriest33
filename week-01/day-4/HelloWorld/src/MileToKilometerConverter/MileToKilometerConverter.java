package MileToKilometerConverter;

import java.util.Scanner;

public class MileToKilometerConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        float userinp = scanner.nextFloat();

        System.out.println(userinp+" miles = "+(userinp*1.609344)+" kilometres");
    }
}
