package Exercise6;

import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Character.isUpperCase;

public class Exercise6 {

    public static void main(String[] args) {

        String input = "GreenFoxAcademy";

        List<Character> result = input.chars()
                .filter(i -> isUpperCase(i))
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
//Write a Stream Expression to find the uppercase characters in a string!