package Exercise9;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {

        String input = "Today is an extremely hot day";

        Map<Character, Long> frequency = input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);

    }
}
