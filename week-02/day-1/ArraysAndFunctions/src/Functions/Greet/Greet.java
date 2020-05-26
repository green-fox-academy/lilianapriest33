package Functions.Greet;

public class Greet {
    public static void main(String[] args) {
        String al = "My Friend";
        greet (al);
    }

    public static void greet(String a) {

        System.out.println("Hello, " + a + "!");
    }
}

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`