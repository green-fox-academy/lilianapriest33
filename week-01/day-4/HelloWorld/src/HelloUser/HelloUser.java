package HelloUser;

import java.util.Scanner;

public class HelloUser {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Can I get your name, please? ");
        String userinput = scanner.nextLine();
        System.out.println("Thx," + userinput + " !");
    }
}
