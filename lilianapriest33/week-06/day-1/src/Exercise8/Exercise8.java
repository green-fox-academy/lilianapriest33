package Exercise8;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {

    public static void main(String[] args) {

        List<Character> charsToString = Arrays.asList('S', 'U', 'M', 'M', 'E', 'R', ' ', 'I', 'S', ' ','H', 'E', 'R', 'E', '!');

        String newString = charsToString.stream()
                .map(s -> s.toString())
                .reduce("", String::concat);

        System.out.println(newString);
    }
}