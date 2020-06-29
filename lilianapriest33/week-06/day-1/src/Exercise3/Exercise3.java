package Exercise3;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .map(x -> (int) Math.pow(x, 2))
                .filter(x -> x > 20)
                .forEach(System.out::println);
    }
}
//Write a Stream Expression to find which number squared value is more then 20 from the list